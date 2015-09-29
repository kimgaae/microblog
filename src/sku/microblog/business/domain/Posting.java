package sku.microblog.business.domain;

import java.io.Serializable;

/**
 * 
 */
public class Posting implements Serializable {
	// Variables
	// Instance Variables
	private static final long serialVersionUID = -7379667744373720254L;
	
	private int postingNum; // 블로그 내에서 해당 포스팅의 번호
	private String title; // 포스팅 제목
	private String writer; // 작성자의 name
	private PostingContent contents; // 포스팅의 내용을 담은 PostingContent 객체
	private String ip; // 포스팅한 기기의 ip 주소
	private int readCount; // 조회수
	private java.util.Date regDate; // 등록 날짜
	private int likes; // 좋아요 수
	private int exposure; // 공개여부 (PUBLIC or PRIVATE)
	private String hashTags; // 해시태그
	private int ref; // 원본 글의 번호(postNum)
	private int replyStep; // 원본 글에 대한 총 댓글의 수 혹은 순서
	private int replyDepth; // 원본 글(0)을 기준으로 한 댓글의 깊이(레벨)
	private int replyCount; // 현재 (댓)글에 달린 댓글의 수
	private boolean isReply = false; // 현재 글이 댓글인 경우 true
	private int reblogCount;
	
	// Class Variables
	public static final int PUBLIC_ALLOW_REPLY = 0; // 댓글
	public static final int PUBLIC_NO_REPLY = 1;
	public static final int PRIVATE = 2;
	
	public static final int NORMAL_TYPE_POSTING = 0;
	public static final int REPLY_TYPE_POSTING = 1;
	public static final int QNA_TYPE_POSTING = 2;
	
	// Constructors
	// 조회용 - all instance variables
	public Posting(int postingNum, String title, String writer, String contents, String ip,
			int readCount, java.util.Date regDate, int likes, int exposure, String hashTags, 
			int ref, int replyStep, int replyDepth, int replyCount, boolean isReply) {
		this.postingNum = postingNum;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.ip = ip;
		this.readCount = readCount;
		this.regDate = regDate;
		this.likes = likes;
		this.exposure = exposure;
		this.hashTags = hashTags;
		this.ref = ref;
		this.replyStep = replyStep;
		this.replyDepth = replyDepth;
		this.replyCount = replyCount;
		this.isReply = isReply;
	}
	
	// 포스팅용 (글 작성)
	public Posting(String title, String writer, String contents, String ip, java.util.Date regDate,
			int exposure, String hashTags) {
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.ip = ip;
		this.regDate = regDate;
		this.exposure = exposure;
		this.hashTags = hashTags;
	}
	
	// 포스팅용 (글 수정)
		public Posting(String title, String writer, String contents, String ip, int exposure, String hashTags) {
			this.title = title;
			this.writer = writer;
			this.contents = contents;
			this.ip = ip;
			this.exposure = exposure;
			this.hashTags = hashTags;
		}
	
	// 댓글용 (댓글 작성)
	public Posting(String title, String writer, String contents, String ip, boolean isReply) {
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.ip = ip;
		this.regDate = new java.util.Date();
		this.isReply = isReply;
	}

	// Methods
	@Override
	public String toString() {
		return "Posting [postingNum=" + postingNum + ", title=" + title + ", writer=" + writer + ", contents=" + contents
				+ ", ip=" + ip + ", readCount=" + readCount + ", regDate=" + regDate + ", likes=" + likes
				+ ", exposure=" + exposure + ", hashTags=" + hashTags + ", ref=" + ref + ", replyStep=" + replyStep
				+ ", replyDepth=" + replyDepth + ", replyCount=" + replyCount + ", isReply=" + isReply + "]";
	}
	
	// Getters
	public int getPostingNum() {
		return postingNum;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public String getContents() {
		return contents;
	}

	public String getIp() {
		return ip;
	}

	public int getReadCount() {
		return readCount;
	}

	public java.util.Date getRegDate() {
		return regDate;
	}

	public int getLikes() {
		return likes;
	}

	public int getExposure() {
		return exposure;
	}

	public String getHashTags() {
		return hashTags;
	}

	public int getRef() {
		return ref;
	}

	public int getReplyStep() {
		return replyStep;
	}

	public int getReplyDepth() {
		return replyDepth;
	}

	public int getReplyCount() {
		return replyCount;
	}

	public boolean getIsReply() {
		return isReply;
	}
	
	// Setters
	public void setPostingNum(int postingNum) {
		this.postingNum = postingNum;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public void setRegDate(java.util.Date regDate) {
		this.regDate = regDate;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void setExposure(int exposure) {
		this.exposure = exposure;
	}

	public void setHashTags(String hashTags) {
		this.hashTags = hashTags;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public void setReplyStep(int replyStep) {
		this.replyStep = replyStep;
	}

	public void setReplyDepth(int replyDepth) {
		this.replyDepth = replyDepth;
	}

	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}

	public void setIsReply(boolean isReply) {
		this.isReply = isReply;
	}
	
}
