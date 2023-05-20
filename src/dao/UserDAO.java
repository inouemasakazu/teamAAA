package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.UserBean;

public class UserDAO extends DAO{
	//ユーザーログイン
	public UserBean userLogin(String login, String password) throws Exception {
		UserBean user = null;
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(
				"select * from user where user_id=? and user_pass=?");
			st.setString(1,login);
		    st.setString(2, password);

		    try {
		    ResultSet rs=st.executeQuery();
		    while (rs.next()) {
		    	user = new UserBean();
		    	user.setuserCode(rs.getInt("user_code"));
		    	user.setuserId(rs.getString("user_id"));
		    	user.setuserPass(rs.getString("user_pass"));
		    	user.setuserName(rs.getString("user_name"));
		    	user.setuserDelete(rs.getInt("user_delete"));
		    	user.setuserDate(rs.getString("user_date"));
			 }
			 return user;

		    }catch (Exception e) {
		    	throw e;
		    }finally {
		    	st.close();
		    	con.close();
		    }
	}

	//idが重複していないか確認するメソッド
	public int idCheck(String userId)throws Exception{

		int line = 0 ;
		//sql実行前処理
		UserBean user1 = null;

		try(Connection con = getConnection();){
			PreparedStatement st = con.prepareStatement(
					"select * from user where user_id = ?");
			st.setString(1, userId);

			//sql実行
			ResultSet rs = st.executeQuery();

			//sql実行結果確認
			while(rs.next()) {
				line++;
			}
			st.close();
	    	con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return line;
	}

	//ニックネームが重複していないか確認するメソッド
	public int nameCheck(String userName)throws Exception{

		int line = 0 ;
		//sql実行前処理
		UserBean user2 = null;

		try(Connection con = getConnection();){
			PreparedStatement st = con.prepareStatement(
					"select * from user where user_name = ?");
			st.setString(1, userName);

			//sql実行
			ResultSet rs = st.executeQuery();

			//sql実行結果確認
			while(rs.next()) {
				line++;
			}
			st.close();
	    	con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return line;
	}


	//ユーザーリスト表示するよ kuma

		public List<UserBean> userlist (String ulist) throws Exception {
				List<UserBean> list = new ArrayList<UserBean> ();
				Connection con = getConnection();

				//消されてない（med_delete=1)はやってない
				PreparedStatement st = con.prepareStatement("select * from user where user_Code like ?");

			try {
					st.setString(1, "%" + ulist + "%");
					ResultSet rs = st.executeQuery ();
					while (rs.next()) {
						UserBean mb = new UserBean();
						mb.setuserCode(rs.getInt("user_code")); //ユーザーコード 自動付与
						mb.setuserId(rs.getString("user_id")); //ユーザーID　任意
						mb.setuserPass(rs.getString("user_pass")); //ユーザーパスワード　任意
						mb.setuserName(rs.getString("user_name")); //ニックネーム　任意
						mb.setuserDate(rs.getString("user_date")); //登録日時
						list.add(mb);
					}

			}catch (Exception e) {
				throw e;
			}finally{
				st.close();
				con.close();
			}
				return list;
		}


//	//ユーザーニックネーム検索
//	public List<UserBean>searchUsNickname(String usNickname)throws
//		Exception{
//		List<UserBean> list = new ArrayList<UserBean>();
//		Connection con = getConnection();
//		PreparedStatement st = con.prepareStatement(
//				"select * from User us where userName like ?");
//		st.setNString(1,"%"+usNickname + "%");
//		try {
//			ResultSet rs = st.executeQuery();
//			while(rs.next()) {
//				UserBean uab = new UserBean();
//				uab.setUsAccount(rs.getInt("usAccount"));
//				uab.setUsID(rs.getNString("usID"));
//				uab.setUsPass(rs.getNString("usPass"));
//				uab.setUsNickname(rs.getNString("usNickname"));
//				uab.setUsCreatedate(rs.getString("usCreateDate"));
//		    	list.add(uab);
//			}
//			return list;
//
//		}catch (Exception e) {
//			throw e;
//		}finally {
//			st.close();
//			con.close();
//		}
//	}
//
//	//ユーザーアカウントコード検索
	public List<UserBean> searchUserCode (String userCode) throws Exception {
		List<UserBean> list = new ArrayList<UserBean> ();
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(
				"select * from user_code where user_delete = 1 and user_code =?");
		st.setNString(1, userCode);
		try {
			ResultSet rs  = st.executeQuery();
			while(rs.next()) {
				UserBean uab = new UserBean();
				uab.setuserCode(rs.getInt("user_code"));
		    	uab.setuserId(rs.getString("user_id"));
		    	uab.setuserPass(rs.getString("user_pass"));
		    	uab.setuserName(rs.getString("user_name"));
		    	uab.setuserDelete(rs.getInt("user_delete"));
		    	uab.setuserDate(rs.getString("user_date"));
		    	list.add(uab);
			}
			return list;

		}catch (Exception e) {
			throw e;
		} finally {
			st.close();
			con.close();

		}
	}


	//ユーザー新規登録
	public int register(UserBean ub2) throws Exception{
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(
				"insert into user values(null,?,?,?,1,now())");
		try {
//			st.setInt(1,ub2.userCode());
			st.setString(1, ub2.getuserId());
			st.setString(2,ub2.getuserPass());
			st.setString(3,ub2.getuserName());
//			st.setInt(4,ab.getuserDelete());
//			st.setString(5,ab.getuserDate());
			int line = st.executeUpdate();

			return line;

		}catch(Exception e) {
			int i = 0;
			return i;
			//throw e;
		}finally {
			st.close();
			con.close();
		}
	}


//ユーザー削除 inoue
	public int delete(UserBean ub)throws Exception{
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(
				"delete from user  where user_code = ?");

		try {
			st.setInt(1,ub.getuserCode());

			int line = st.executeUpdate();

			return line;

		} catch(Exception e) {
			int i = 0;
			return i;
		} finally {
			st.close();
			con.close();
		}
	}

//	//ユーザーアカウントの変更//意味不明　ユーザー編集できひん
	public int edit(UserBean ub) throws Exception{
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(
				"update user set user_id = ?,user_pass = ?, user_name = ? where user_code = ?");
		try {
			st.setString(1,ub.getuserId());
			st.setString(2,ub.getuserPass());
			st.setString(3,ub.getuserName());
			st.setInt(4,ub.getuserCode());


			int line = st.executeUpdate();

			return line;

			}catch (Exception e) {
				e.printStackTrace();
				int i =0;
				return i;
			}finally {
				st.close();
				con.close();
			}
		}


}

////ユーザー退会
//public int delete(UserBean ub3)throws Exception{
//	Connection con = getConnection();
//	PreparedStatement st = con.prepareStatement(
//			"update user set user_delete = 1 where user_code = ? and user_name = ?;");
//	try {
//		st.setString(1,ub3.getuserCode());
//		st.setString(2,ub3.getuserName());
//		int line = st.executeUpdate();
//
//		return line;
//
//		}catch (Exception e) {
//			throw e;
//		}finally {
//			st.close();
//			con.close();
//		}
//	}
