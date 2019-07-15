package dao;

import model.City;
import utils.DataBaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TestDao {
    public List<City> method1(Integer countryId) throws Exception {
        Connection conn = DataBaseUtil.getConnection();
        String sql="select * from city where conutry_id=?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1,countryId);
        ResultSet resultSet = statement.executeQuery();
        ArrayList<City> cities = new ArrayList<City>();
        while (resultSet!=null){
            City city = new City();
            city.setId(resultSet.getInt("city_id"));
            city.setName(resultSet.getString("city"));
            cities.add(city);
        }
        return cities;
    }
}
