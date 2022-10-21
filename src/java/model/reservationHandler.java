/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author sandun
 */
public class reservationHandler {
    public static Connection getConnection(){  
        Connection con = null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
        
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int addReserv(reservBean b){  
        int status=0;  
        try{  
            Connection con=reservationHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("insert into reservation(name,checkin,checkout) values (?,?,?)");  
            ps.setString(1,b.getName());  
            ps.setString(2,b.getCheckin());  
            ps.setString(3,b.getCheckout());
              
            status = ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }
    
    public static int updateReser(reservBean b){  
        int status=0;  
        try{  
            Connection con=reservationHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("update reservation set checkin=?,checkout=? where name=?");  
            ps.setString(1,b.getName());  
            ps.setString(2,b.getCheckin());  
            ps.setString(3,b.getCheckout()); 
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
    
    public static int deleteReser(String name){  
        int status=0;  
        try{  
            Connection con=reservationHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from reservation where name=?");  
            ps.setString(1,name);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    } 
    
    public static reservBean getReservation(String name){  
        reservBean b = new reservBean();  
          
        try{  
            Connection con=reservationHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from reservation where name=?");  
            ps.setString(1,name);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                b.setName(rs.getString(1));  
                b.setCheckin(rs.getString(2));  
                b.setCheckout(rs.getString(3));   
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return b;  
    }
}
