package cn.yunhe.store.user.domain.copy;

//user类对象

public class User {

//对应数据库的表字段

private String uid;//用户id主键
private String username;//用户名
private String password;//密码 
private String email;//邮箱
private String state;//用户状态
public String getUid() {
	return uid;
}
public String getUsername() {
	return username;
}
public String getPassword() {
	return password;
}
public String getEmail() {
	return email;
}
public String getState() {
	return state;
}
public void setUid(String uid) {
	this.uid = uid;
}
public void setUsername(String username) {
	this.username = username;
}
public void setPassword(String password) {
	this.password = password;
}
public void setEmail(String email) {
	this.email = email;
}
public void setState(String state) {
	this.state = state;
}
public User(String uid, String username, String password, String email, String state) {
	super();
	this.uid = uid;
	this.username = username;
	this.password = password;
	this.email = email;
	this.state = state;
}
public User() {
	super();
}
@Override
public String toString() {
	return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", email=" + email + ", state="
			+ state + "]";
}








}
