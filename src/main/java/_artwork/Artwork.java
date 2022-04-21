package _artwork;

public class Artwork {
    private String title;
    private String artist;
    private String nft;
    private int price;

    public Artwork(String title, String artist, String nft, int price){
        this.title = title;
        this.artist = artist;
        this.nft = nft;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getNft() {
        return nft;
    }

    public void setNft(String nft) {
        this.nft = nft;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
