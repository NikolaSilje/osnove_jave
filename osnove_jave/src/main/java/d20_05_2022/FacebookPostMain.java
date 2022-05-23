package d20_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {
        FacebookPost post1 = new FacebookPost("Proka Prokic", "Nikola Nikolic",
                "https://www.youtube.com/watch?v=U-KJeXflHIQ... Kako je u tudjini?");

        post1.likes = 3;
        post1.share = 12;

        post1.like();
        post1.dislike();
        post1.dislike();
        post1.dislike();
        post1.dislike();
        post1.dislike();
        post1.increaseShare();
        post1.increaseShare();

        post1.print();

        FacebookPost post2 = new FacebookPost("Proka Prokic", "Nikola Nikolic",
                "https://www.youtube.com/watch?v=tTr7-NMg1gc");

        post2.likes = 12;
        post2.share = 10;

        post2.dislike();
        post2.dislike();
        post2.like();
        post2.like();
        post2.like();
        post2.dislike();
        post2.increaseShare();
        post2.increaseShare();
        post2.increaseShare();

        post2.print();





}
    }