public class SearcherForLooking extends AbstractSearcher {
    public SearcherForLooking(IGoodBodyGirl goodBodyGirl) {
        super(goodBodyGirl);
    }

    @Override
    public void show() {
        System.out.println("美女信息如下");
        super.goodBodyGirl.goodLooking();
        super.goodBodyGirl.niceFigure();
    }
}
