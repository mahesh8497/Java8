package two_list_print_common_string;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Launch1 {
public static void main(String[] args) {
	 // Example lists
    List<String> list1 = List.of("apple", "banana", "cherry", "date");
    List<String> list2 = List.of("banana", "cherry", "fig", "grape");

    // Find common strings
    List<String> commonStrings = findCommonStrings(list1, list2);

    // Print the result
    System.out.println("Common strings: " + commonStrings);
}

public static List<String> findCommonStrings(List<String> list1, List<String> list2) {
    // Convert list2 to a Set for efficient lookups
    Set<String> set2 = new HashSet<>(list2);

    // Filter list1 to keep only elements present in set2
    return list1.stream()
                .filter(set2::contains)
                .collect(Collectors.toList());
}
}
