package com.plachkovskyy.dao;

import com.plachkovskyy.model.CalculatorModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CalculatorOracleSQL {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int results() {
        return jdbcTemplate.query("SELECT * FROM CALCULATIONS", new RowMapper<CalculatorModel>() {
            @Override
            public CalculatorModel mapRow(ResultSet resultSet, int i) throws SQLException {
                return null;
            }

            @Override
            public CalculatorModel mapRow(ResultSet resultSet, int a, int b, int operation) throws SQLException {
                CalculatorModel calculator = new CalculatorModel(a, b, operation);
                calculator.setA(resultSet.getInt(1));
                calculator.setOperation(resultSet.getInt(2));
                calculator.setB(resultSet.getInt(3));
                calculator.setRes(resultSet.getInt(4));
                return calculator;
            }
        });
    }

}
