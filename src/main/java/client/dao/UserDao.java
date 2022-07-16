package client.dao;

import client.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao extends BaseDao
{
    //注册
    public String Register(String name, String password)
    {
        int count = 1;
        String resultStr = "注册失败";
        String sql = "insert into user values(?,?,?)";
        try {
            this.pStatement = this.con.prepareStatement(sql);
            this.pStatement.setInt(1, count);
            this.pStatement.setString(2, name);
            this.pStatement.setString(3, password);
            if(this.pStatement.executeUpdate()>0)
            {
                resultStr="注册成功";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.close();
        }
        return resultStr;
    }
    //登录
    public User selectUser(String name, String password)
    {
        String sqlStr="select * from user where name = ? and password = ?";
        User user = null;
        try {
            this.pStatement=this.con.prepareStatement(sqlStr);
            this.pStatement.setString(1,name);
            this.pStatement.setString(2,password);
            ResultSet executeQuery=this.pStatement.executeQuery();
            if(executeQuery.next())
            {
                user = new User(executeQuery.getInt(1),executeQuery.getString(2),executeQuery.getString(3));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.close();
        }
        return user ;
    }

}
