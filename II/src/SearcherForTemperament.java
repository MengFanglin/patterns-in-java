public class SearcherForTemperament extends AbstractSearcher {
    public SearcherForTemperament(IGreatTemperamentGirl greatTemperamentGirl) {
        super(greatTemperamentGirl);
    }

    @Override
    public void show() {
        System.out.println("美女信息如下");
        super.greatTemperamentGirl.greatTemperament();
    }
}
