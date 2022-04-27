package com.ecommerce.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.springjdbc.entity.EproductEntity;

public class EProductDAO {



	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


    public List<EproductEntity> getProducts(){    
        return jdbcTemplate.query("select * from eproduct",new RowMapper<EproductEntity>(){    
            public EproductEntity mapRow(ResultSet rs, int row) throws SQLException {    
                    EproductEntity e=new EproductEntity();    
                e.setID(rs.getInt(1));    
                e.setName(rs.getString(2));    
                e.setPrice(rs.getBigDecimal(3));    
                e.setDateAdded(rs.getDate(4));    
                return e;    
            }    
        });    
    }    
}

