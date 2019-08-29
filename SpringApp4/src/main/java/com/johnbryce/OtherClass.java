package com.johnbryce;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Component
@Data
@NoArgsConstructor
public class OtherClass {
	
	@org.springframework.beans.factory.annotation.Value("19")
	private @NonNull int id;
	
	@org.springframework.beans.factory.annotation.Value("Igor")
	private @NonNull String name;
	

}
