import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


object ppj {

def main(args: Array[String]) {
 
  val url = "jdbc:mysql://localhost/scala"
    val username = "root"
    val password = ""
    var a : Int=0
     var connection:Connection = null
    
    try {
      // make the connection
      Class.forName("com.mysql.jdbc.Driver")
      connection = DriverManager.getConnection(url, username, password)
       
      println("nom d'utilisateur :")
      var no = readLine
      var nom = no.toString()
      println("mot de passe :")
      var pa = readLine
      var mdp = pa.toString()
       
     // create the statement, and run the select query
     val statement = connection.createStatement()
    // val resultat = statement.executeQuery("SELECT  mdp from user where username='"+nom+"'")
     val resultat = statement.executeQuery("SELECT  username,mdp from user")
     while(resultat.next()) {
     var hh = resultat.getString("mdp")
     var nn= resultat.getString("username")
     if(nn==nom) {
     if(hh==mdp) {
       a=1}
     //  println("mer7ba biik Mr "+nom) }
       else  a=0 //println("ton mot de passe ou ton username est incorrect")
     }
     //else a=0
             }
      
    if(a==0) println("les données que vous avez saisi sont incorrectes")
    else println("mer7ba Mr: "+nom+" vous avez bien connecté")
    }
    finally {
    connection.close()
    }
    
}
}