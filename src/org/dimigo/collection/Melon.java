package org.dimigo.collection;

import java.util.List;

public class Melon {

	private int menuId;
	private int count;
	private int page;
	private int totalPages;
	private String rankDay;
	private String rankHour;
	
	// 차트 순위에 따라 노래들을 담는 List
	private List<Song> songs;

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public String getRankDay() {
		return rankDay;
	}

	public void setRankDay(String rankDay) {
		this.rankDay = rankDay;
	}

	public String getRankHour() {
		return rankHour;
	}

	public void setRankHour(String rankHour) {
		this.rankHour = rankHour;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	@Override
	public String toString() {
		return "Melon [menuId=" + menuId + ", count=" + count + ", page="
				+ page + ", totalPages=" + totalPages + ", rankDay=" + rankDay
				+ ", rankHour=" + rankHour + ", songs=" + songs + "]";
	}
	
}
