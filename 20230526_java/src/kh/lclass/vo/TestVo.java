package kh.lclass.vo;

public class TestVo {
	private int boardNum;
	private String boardWriter;
	private String boardTitle;
	private String boardContent;
	private String boardDate;
	public TestVo() {}
	public TestVo(int boardNum, String boardWriter, String boardTitle,
			String boardContent,String boardDate) {
//		this.boardContent=boardContent;
//		this.boardDate=boardDate;
		this.boardNum=boardNum;
		this.boardTitle=boardTitle;
		this.boardWriter=boardWriter;
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum=boardNum;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoradWriter(String boardWriter) {
		this.boardWriter= boardWriter;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle=boardTitle;
	}
	public String getBoardContent(){
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent=boardContent;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate=boardDate;
	}
	public String toString() {
		String result = null;
		return result;
	}
}
