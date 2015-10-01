package sku.microblog.business.domain;

import java.io.Serializable;

/**
 * 
 */
public class Blog implements Serializable {
	// Variables
	// Instance Variables
	private static final long serialVersionUID = 1900033617868843759L;
	
	private String memberName; //블로그 소유자의 이름
	private String blogName; // 블로그의 이름(URL로 사용됨)
	private int followerCount; // 해당 블로그를 팔로잉한 사람의 수
	private int backgroundColor; // 블로그의 배경색
	private String headerImage; // 블로그 헤더 이미지 파일의 URL(Built-in / custom img)
	private String profileImage; // 블로그의 사용자 프로필 이미지 파일의 URL(Built-in / custom img)
	private int blogLayout; // 블로그의 레이아웃
	
	// Class Variables
	/** 포스팅의 전체 정보를 포함한 포스팅들이 목록화 되어 보여지는 레이아웃 */
	public static final int LISTED_LAYOUT = 0;
	/** 포스팅의 요약 정보만 포함한 포스팅들이 목록화 되어 보여지는 레이아웃 */
	public static final int LISTED_SUMMARY_LAYOUT = 1;
	/** 포스팅의 전체 정보를 포함한 포스팅들이 행렬과 유사한 형식으로 보여지는 레이아웃 */
	public static final int GRID_LAYOUT = 2;
	
	// Constructors
	// 블로그 생성 테스트용
	public Blog(String memberName, String blogName) {
		this.memberName = memberName;
		this.blogName = blogName;
	}
	
	// 블로그 생성용
	public Blog(String memberName, String blogName, int backgroundColor, String headerImage, String profileImage, int blogLayout) {
		this.memberName = memberName;
		this.blogName = blogName;
		this.backgroundColor = backgroundColor;
		this.headerImage = headerImage;
		this.profileImage = profileImage;
		this.blogLayout = blogLayout;
	}
	
	// 팔로워 조회용
	public Blog(String memberName, String blogName, int followerCount) {
		this(memberName, blogName);
		this.followerCount = followerCount;
	}
	
	// 조회용
	public Blog(String memberName, String blogName, int followerCount, int backgroundColor, String headerImage, String profileImage, int blogLayout) {
		this.memberName = memberName;
		this.blogName = blogName;
		this.followerCount = followerCount;
		this.backgroundColor = backgroundColor;
		this.headerImage = headerImage;
		this.profileImage = profileImage;
		this.blogLayout = blogLayout;
	}

	// Methods
	@Override
	public String toString() {
		return "Blog [memberName=" + memberName + ", blogName=" + blogName + ", followerCount=" + followerCount
				+ ", backgroundColor=" + backgroundColor + ", headerImage=" + headerImage + ", profileImage="
				+ profileImage + ", blogLayout=" + blogLayout + "]";
	}

	// Getters
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getBlogName() {
		return blogName;
	}

	public int getFollowerCount() {
		return followerCount;
	}

	public int getBackgroundColor() {
		return backgroundColor;
	}

	public String getHeaderImage() {
		return headerImage;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public int getBlogLayout() {
		return blogLayout;
	}

	// Setters
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	public void setFollowerCount(int followerCount) {
		this.followerCount = followerCount;
	}

	public void setBackgroundColor(int backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public void setHeaderImage(String headerImage) {
		this.headerImage = headerImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public void setBlogLayout(int blogLayout) {
		this.blogLayout = blogLayout;
	}

}
