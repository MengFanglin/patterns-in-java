public class App {
    public static void main(String [] args){
        IGreatTemperamentGirl dash = new PrettyGirl("dash");
        AbstractSearcher searcher4temp = new SearcherForTemperament(dash);
        searcher4temp.show();

        IGoodBodyGirl rc = new PrettyGirl("rc");
        AbstractSearcher searcher4looking = new SearcherForLooking(rc);
        searcher4looking.show();


    }
}
