package service;

public class SearchPageDataReader {

    public static final String TESTDATA_SEARCHQUERY = "testdata.searchQuery";
    public static final String TESTDATA_FILTER_MAX_PRICE = "testdata.filter.max.price";

    public static String getSearchQuery(){
        return TestDataReader.getTestData(TESTDATA_SEARCHQUERY);
    }

    public static String getFilterMaxPrice(){
        return TestDataReader.getTestData(TESTDATA_FILTER_MAX_PRICE);
    }


}
