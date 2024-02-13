import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

public class ListTests {
    @Test
    public void testMerge{
        List<String> input = new ArrayList<>();
        input.add("Apple");
        input.add("Banana");

        List<String> input2 = new ArrayList<>();
        input2.add("Orange");
        input2.add("Peach");

        List<String> merged = new ArrayList<>();
        merged.add("Apple");
        merged.add("Banana");
        merged.add("Orange");
        merged.add("Peach");

        assertEquals(merged, ListExamples.merge(input, input2));
        
    }
}
    
}
