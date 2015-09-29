package sku.microblog.business.service;

import sku.microblog.business.domain.Member;
import sku.microblog.util.DataDuplicatedException;
import sku.microblog.util.DataNotFoundException;

public interface MemberService {
	
	/**
	 * 매개변수(argument)로 들어온 Member 객체 
	 * @param email 확인하고자하는 회원의 E-Mail(ID)
	 * @param password 확인하고자하는 회원의 password
	 * @return 유효성 검증 정보가 포함된 Member 객체
	 */
	public abstract Member loginCheck(String email, String password);
	
	/**
	 * 매개변수로 들어온 Member 객체 정보에 해당하는 회원을 등록(회원 가입)한다.
	 * @param member 등록할 회원의 정보가 담긴 Member 객체
	 */
	public abstract void registerUser(Member member) throws DataDuplicatedException;
	
	/**
	 * 매개변수로 들어온 Member 객체 정보에 해당하는 회원 정보를 갱신(회원정보 변경)한다.
	 * @param member 수정할 사용자의 정보가 담긴 Member 객체
	 */
	public abstract void updateUser(Member member) throws DataNotFoundException;
	
	/**
	 * 매개변수로 들어온 Member 객체 정보에 해당하는 회원을 제거(회원 탈퇴)한다.
	 * @param member 삭제할 회원의 정보가 담긴 Member 객체
	 */
	public abstract void removeUser(Member member) throws DataNotFoundException;
	
	/**
	 * 매개변수로 들어온 이름과 같은 회원을 검색한다.
	 * @param name 검색하고자하는 회원의 name
	 * @return 매개변수로 들어온 문자열과 일치하는 이름을 가진 회원 정보가 포함된 Member 객체
	 */
	public abstract Member findUser(String name) throws DataNotFoundException;
	/** 
	 * 모든 User를 검색한다.
	 * @return 저장소에 저장된 모든 Member 객체 배열
	 */
	public abstract Member[] getAllUsers();
}
