package test.com.jason.spring01; 

import com.jason.spring01.BookService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* BookService Tester.
* 
* @author Liu 
* @since <pre>08/24/2018</pre> 
* @version 1.0 
*/ 
public class BookServiceTest { 
BookService service = new BookService();
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: addNewBook() 
* 
*/ 
@Test
public void testAddNewBook() throws Exception { 
    service.addNewBook();
} 


} 
