package com.optional;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class optionalTest {

	@Test
	void nullEnOptional() {
		String name = null;
		assertThrows(NullPointerException.class, () -> {
			Optional.of(name);
		});
	
	}

}
