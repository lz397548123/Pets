package pett.bean;

import java.sql.*;

public class MasterBean {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/pets?serverTimezone=GMT%2B8";
    private String username = "root";
    private String password = "pepsi";
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public Statement getStatment() {
        try {
            Class.forName(getDriver());
            con = DriverManager.getConnection(getUrl(), getUsername(), getPassword());
            return con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }


    public boolean addMaster(String mrId, String mrName, String mrSex, String mrAge, String mrAddress, String mrTel, String mrPet) {
        try {
            String sql = "insert into master" + "(id,name,sex,age,address,tel,pet)" + "Values (" + "'" + mrId + "'" + "," + "'" + mrName + "'" + "," + "'" + mrSex + "'" + "," + "'" + mrAge + "'" + "," + "'" + mrAddress + "'" + "," + "'" + mrTel + "'" + "," + "'" + mrPet + "'" + ")";
            System.out.println(selectUpdateMaster(mrId) == null);
            if (selectUpdateMaster(mrName) == null) {
                st.close();
                con.close();
                return false;
            }
            st = getStatment();
            int row = st.executeUpdate(sql);
            st.close();
            con.close();
            return row == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addDoctor(String mrId, String mrName, String mrSex, String mrAge, String mrAddress, String mrTel, String mrSkill) {
        try {
            String sql = "insert into doctor" + "(id,name,sex,age,address,tel,skill)" + "Values (" + "'" + mrId + "'" + "," + "'" + mrName + "'" + "," + "'" + mrSex + "'" + "," + "'" + mrAge + "'" + "," + "'" + mrAddress + "'" + "," + "'" + mrTel + "'" + "," + "'" + mrSkill + "'" + ")";
            if (selectUpdateDoctor(mrId) == null) {
                st.close();
                con.close();
                return false;
            }
            st = getStatment();
            int row = st.executeUpdate(sql);
            st.close();
            con.close();
            return row == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addPet(String petId, String petName, String petKind, String petSex, String petAge, String petAddress, String mrPetName, String mrPetTel) {
        try {
            String sql = "insert into pet" + "(id, petName, kind, sex, age, address, name, tel)" + "Values (" + "'" + petId + "'" + "," + "'" + petName + "'" + "," + "'" + petKind + "'" + "," + "'" + petSex + "'" + "," + "'" + petAge + "'" + "," + "'" + petAddress + "'" + "," + "'" + mrPetName + "'" + "," + "'" + mrPetTel + "'" + ")";
            if (selectUpdatePet(petId) == null) {
                st.close();
                con.close();
                return false;
            }
            st = getStatment();
            int row = st.executeUpdate(sql);
            st.close();
            con.close();
            return row == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delMaster(String mrId) {
        try {
            String sql = "delete from master where id = '" + mrId + "'";
            st = getStatment();
            int row = st.executeUpdate(sql);
            st.close();
            con.close();
            return row == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delDoctor(String mrId) {
        try {
            String sql = "delete from doctor where id = '" + mrId + "'";
            st = getStatment();
            int row = st.executeUpdate(sql);
            st.close();
            con.close();
            return row == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delPet(String petId) {
        try {
            String sql = "delete from pet where id = '" + petId + "'";
            st = getStatment();
            int row = st.executeUpdate(sql);
            st.close();
            con.close();
            return row == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //查询宠物主人的信息
    public ResultSet selectSearchMaster(String mrName) {
        try {
            String sql = "select * from master where name = '" + mrName + "'";
            st = getStatment();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //查询要修改的宠物主人的信息
    public ResultSet selectUpdateMaster(String mrId) {
        try {
            String sql = "select * from master where id = '" + mrId + "'";
            st = getStatment();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet selectSearchDoctor(String mrName) {
        try {
            String sql = "select * from doctor where name = '" + mrName + "'";
            st = getStatment();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet selectUpdateDoctor(String mrId) {
        try {
            String sql = "select * from doctor where id = '" + mrId + "'";
            st = getStatment();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet selectUpdatePet(String petId) {
        try {
            String sql = "select * from pet where id = '" + petId + "'";
            st = getStatment();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet selectPetSick(String id) {
        try {
            String sql = "select id, sickTime, remarks from petsick where id = '" + id + "'";
            st = getStatment();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean addPetSick(String id, String remarks) {
        try {
            String sql = "insert into petsick" + "(id, remarks)" + "Values (" + "'" + id + "'" + "," + "'" + remarks + "'" + ")";
            st = getStatment();
            st.executeUpdate(sql);
            st.close();
            con.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    //修改宠物主人的信息
    public boolean updateMaster(String mrId, String mrName, String mrSex, String mrAge, String mrAddress, String mrTel, String mrPet) {
        try {
            String sql = "update master set name = '" + mrName + "',sex = '" + mrSex + "',age = '" + mrAge + "',address = '" + mrAddress + "',tel = '" + mrTel + "',pet = '" + mrPet + "' where id = '" + mrId + "'";
            st = getStatment();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateDoctor(String mrId, String mrName, String mrSex, String mrAge, String mrAddress, String mrTel, String mrSkill) {
        try {
            String sql = "update doctor set name = '" + mrName + "',sex = '" + mrSex + "',age = '" + mrAge + "',address = '" + mrAddress + "',tel = '" + mrTel + "',skill = '" + mrSkill + "' where id = '" + mrId + "'";
            st = getStatment();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updatePet(String petId, String petName, String petKind, String petSex, String petAge, String petAddress, String mrPetName, String mrPetTel) {
        try {
            String sql = "update pet set petName = '" + petName + "',kind = '" + petKind + "',sex = '" + petSex + "',age = '" + petAge + "',address = '" + petAddress + "',name = '" + mrPetName + "',tel = '" + mrPetTel + "' where id = '" + petId + "'";
            st = getStatment();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
