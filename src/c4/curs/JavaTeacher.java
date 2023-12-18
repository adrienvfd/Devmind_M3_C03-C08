package c4.curs;


public class JavaTeacher implements ITeacher {
    private WisdomWordsService wisdomService;


    public JavaTeacher() {
    }
    public JavaTeacher(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }

    @Override
    public String getHomeWork() {
        return "Create 100 classes";
    }

    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }
}
