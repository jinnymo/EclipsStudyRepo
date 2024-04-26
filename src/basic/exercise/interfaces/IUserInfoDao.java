package basic.exercise.interfaces;

public interface IUserInfoDao {
	
	
	//  C  U  R  D
	
	//TODO - 매개변수 수정 예정
	public void insertUserInfo(UserInfo info); //public abstract 생략 가능
	
	//단 수정이 되면 안되는 것은 제외.
	public abstract void updateUserInfo(UserInfo info);
	
	
	public abstract void deleteUserInfo(int id);
	public abstract void selectUserInfo();//조회


}
