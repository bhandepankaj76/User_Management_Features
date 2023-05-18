package com.springboot.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class PostResponse {
    public PostResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PostResponse(List<PostDto> content, int pageNo, int pageSize, long totalElements, int totalPages,
			boolean last) {
		super();
		this.content = content;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.totalElements = totalElements;
		this.totalPages = totalPages;
		this.last = last;
	}
	private List<PostDto> content;
    private int pageNo;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean last;
    
    /* - - - - - - - - - - - - - - - - - - - - - - - - - */

    // USE Getters & Setters ( Content, PageNo, PageSize, TotalElements, TotalPages, Last ) - - */
	
    /* - - - - - - - - - - - - - - - - - - - - - - - - - */

    
	/* - - - - - - - - - - - Getters & Setters ( Content ) - - - - - - - - - - - - - - */
	public List<PostDto> getContent() {
		return content;
	}
	public void setContent(List<PostDto> content) {
		this.content = content;
	}
	/* - - - - - - - - - - - Getters & Setters ( PageNo ) - - - - - - - - - - - - - - */

	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	/* - - - - - - - - - - - Getters & Setters ( PageSize ) - - - - - - - - - - - - - - */

	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/* - - - - - - - - - - - Getters & Setters ( TotalElement ) - - - - - - - - - - - - - - */

	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	/* - - - - - - - - - - - Getters & Setters ( TotalPages ) - - - - - - - - - - - - - - */

	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	/* - - - - - - - - - - - Getters & Setters ( Last ) - - - - - - - - - - - - - - */

	public boolean isLast() {
		return last;
	}
	public void setLast(boolean last) {
		this.last = last;
	}
	/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
}
