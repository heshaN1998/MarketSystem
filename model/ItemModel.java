/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;
import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.itemDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author ACER
 */




public class ItemModel {
    
   public String saveItem(itemDto itemDto) throws Exception{

Connection connection=DBConnection.getInstance().getConnection();
String sql = "INSERT INTO iTEM values(?,?,?,?,?)";
PreparedStatement statement=connection.prepareStatement(sql);
statement.setString(1,itemDto.getCode());
statement.setString(2,itemDto.getDesc());
statement.setString(3,itemDto.getPack());
statement.setDouble(4,itemDto.getUnitPrize());
statement.setInt(5,itemDto.getQoh());

return statement.executeUpdate() > 0 ? "sucess":"fail";
   }
   
    public String updateItem(itemDto itemDto) throws Exception{

Connection connection=DBConnection.getInstance().getConnection();
String sql = "UPDATE item SET description=?,PackSize=?,QtyOnHand=? WHERE itemCode=?";
PreparedStatement statement=connection.prepareStatement(sql);

statement.setString(1,itemDto.getDesc());
statement.setString(2,itemDto.getPack());
statement.setDouble(3,itemDto.getUnitPrize());
statement.setInt(4,itemDto.getQoh());
statement.setString(5,itemDto.getCode());

return statement.executeUpdate() > 0 ? "sucess":"fail";
 }
    
    public String deleteItem(String itemCode) throws Exception{

Connection connection=DBConnection.getInstance().getConnection();
String sql = "DELETE FROM Item  WHERE itemCode=?";
PreparedStatement statement=connection.prepareStatement(sql);

statement.setString(1, itemCode);

return statement.executeUpdate() > 0 ? "sucess":"fail";
 }
    
    public itemDto getItem(String itemCode) throws Exception{

Connection connection=DBConnection.getInstance().getConnection();
String sql = "SELECT * FROM Item WHERE ItemCode=?";
PreparedStatement statement=connection.prepareStatement(sql);

ResultSet rst = statement.executeQuery();
if(rst.next()){
itemDto itemDto =new itemDto(
rst.getString("itemCode"),
rst.getString("Description"),
        rst.getString("PackSize"),
        rst.getDouble("UnitPrize"),
        rst.getInt("QtyOnHand"));

return itemDto;
}

return null;
 }
     public ArrayList<itemDto> getAll() throws Exception{

Connection connection=DBConnection.getInstance().getConnection();
String sql = "SELECT * FROM Item";
PreparedStatement statement=connection.prepareStatement(sql);

ResultSet rst = statement.executeQuery();
ArrayList<itemDto> itemDtos=new ArrayList<>();
while(rst.next()){
itemDto itemDto =new itemDto(
rst.getString("itemCode"),
rst.getString("Description"),
        rst.getString("PackSize"),
        rst.getDouble("UnitPrize"),
        rst.getInt("QtyOnHand"));

itemDtos.add(itemDto);
}

return itemDtos;
     }
     
    
    
   }
