package HomeWork13;

public class DynamicXpathNext {
	/*
	 * 10) Tag with parents 
	 * 
	 * Example 1 medicare
	 * //a[@class='color-blueDark lg-color-white size-14'] [1]
	 * //a[@class='color-blueDark lg-color-white size-14']//parent: :li [0]
	 * Example 2 for employer
	 * //a[text()='For Employers'] [2]
	 * //a[text()='For Employers']//parent: :ul [0]
	 * example 3 employer
	 * //a[text()='For Employers'] [2]
	 * //a[text()='For Employers' and @class='color-blueDark lg-color-white size-14'] [2]
	 * example 4 for broker and consultants
	 * //a[text()='For Brokers & Consultants'] [2]
	 * example 5 search box
	 * 
	 * 11) Tag with child 
	 * //div[@class='search-bar-focus borderRadius-35 position-relative']//child::div[@class='search__autocomplete-items hide']
	 * //div[@class='search-bar-focus borderRadius-35 position-relative']//child::span[@class='error hide mx-2 search-suggest--empty']
	 * 12)Tag with following sibling {younger brother} 
	 * //div[@class='find-doctor position-relative  cta button-style__outline-blue cta--remove-icon mr-2 lg-items-center lg-flex']//following-sibling::div[@class='signin signin-menu__content-wrapper position-relative lg-items-center lg-flex']
	 * 
	 * Tag with inner text/attribute (if multiple is present) [Last choice]
	 * 
	 * //a[text()='For Employers'] [2]
	 * //a[text()='For Employers']//parent::li [2]
	 * 
	 * 
	 * */
}
