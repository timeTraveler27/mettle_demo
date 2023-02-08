package com.mettle.duplicateFinder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class DuplicateFinderApplicationTests {
	private final String noDupMsg = "There are no duplicates";
	private final String emptyListMsg = "The list is empty, some values are required";

	@Test
	void findDuplicateIfDuplicateExists() {
		List<Integer> numbers = List.of(1, 3, 5, 1, 3, 8);
		DuplicateFinder finder = new DuplicateFinder();
		assertEquals("1", finder.findDuplicate(numbers));
	}

	@Test
	void findDuplicateIfNoDuplicateExists() {
		List<Integer> numbers = List.of(1, 3, 5, 8, 7, 4);
		DuplicateFinder finder = new DuplicateFinder();
		assertEquals(noDupMsg, finder.findDuplicate(numbers));
	}

	@Test
	void findDuplicateIfListIsEmpty() {
		List<Integer> numbers = new ArrayList<>();
		DuplicateFinder finder = new DuplicateFinder();
		assertEquals(emptyListMsg, finder.findDuplicate(numbers));
	}

	@Test
	void findDuplicateIfListIsNull() {
		DuplicateFinder finder = new DuplicateFinder();
		assertThrows(NullPointerException.class, () -> {
			finder.findDuplicate(null);
		});
	}
}
