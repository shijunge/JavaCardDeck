public class Card implements Comparable<Card> {

	private int suit;
	private String suitName;
	private int rank;
	private String rankName;
	
	public Card(int Suit, String suitName, int Rank, String rankName){
		this.suit=Suit;
		this.suitName=suitName;
		this.rank=Rank;
		this.rankName=rankName;
	}
    
	public int getSuit(){
		return this.suit;
	}
	public String getSuitName(){
		return this.suitName;
	}
	public int getRank(){
		return this.rank;
	}
	public String getRankName(){
		return this.rankName;
	}
	
	@Override
	public String toString(){
		return this.suitName+":"+this.rankName;
	}
	
	public int compareTo(Card c){
		int ret=0;
		if (this.getSuit()<c.getSuit()){
			ret=-1;
		}else if(this.getSuit()>c.getSuit()){
			ret=1;
		}else{
			if(this.getRank()<c.getRank()){
				ret=-1;
			}else if(this.getRank()>c.getRank()) {
				ret=1;
			}
		}
		return  ret;
	}
}
