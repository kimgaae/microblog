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
	private int followers; // 해당 블로그를 팔로잉한 사람의 수
	private int theme; // blog의 테마(배경 이미지, 프로필 사진으로 구성)
	
	// Class Variables
	public static final int DEFAULT_THEME = 0;
	public static final int BUILT_IN_THEME = 1;
	public static final int CUSTOMIZED_THEME = 2;
	
	// Constructors
	public Blog(String userName, String blogName) {
		this.memberName = userName;
		this.blogName = blogName;
	}
	
	public Blog(String userName, String blogName, int followers) {
		this(userName, blogName);
		this.followers = followers;
	}

	// Methods
	@Override
	public String toString() {
		return "Blog [memberName=" + memberName + ", blogName=" + blogName + ", followers=" + followers + ", theme=" + theme
				+ "]";
	}

	// Getters
	public String getMemberName() {
		return memberName;
	}

	public String getBlogName() {
		return blogName;
	}

	public int getFollowers() {
		return followers;
	}

	public int getTheme() {
		return theme;
	}

	
	// Setters
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public void setTheme(int theme) {
		this.theme = theme;
	}
	
}
