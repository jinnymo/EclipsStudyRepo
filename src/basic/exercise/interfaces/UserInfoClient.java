package basic.exercise.interfaces;

public class UserInfoClient {

	public static void main(String[] args) {
		//사용자에게 정보를 입력하세요 -->스캐너
		String inputUserName = "홍길동";
		String inputUserPw = "asd123";
		
		//DTO : data trancefer object 데이터들을 받아서(취합 및 가공) 전달하는
		//역할을 가지고 있는 인스턴스를 말한다.
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		
		//데이터를 받아서 IUserInfoDao를 구현한 구현 클래스에세 전달하고자 한다.
		//UserInfoMySqlDaoImpl,userInfoOracleDaoImpl
		//IUserInfoDao iUserInfoDao1 = new UserInfoMySqlDaoImpl();
		IUserInfoDao iUserInfoDao1 = new userInfoOracleDaoImpl();
		iUserInfoDao1.insertUserInfo(userInfo);
		iUserInfoDao1.updateUserInfo(userInfo);;
		iUserInfoDao1.deleteUserInfo(userInfo.getId());
		iUserInfoDao1.selectUserInfo();
	
	}
	
}
