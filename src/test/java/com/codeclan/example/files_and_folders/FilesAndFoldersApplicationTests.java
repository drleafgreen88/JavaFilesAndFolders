package com.codeclan.example.files_and_folders;

import com.codeclan.example.files_and_folders.repository.FileRepository;
import com.codeclan.example.files_and_folders.repository.FolderRepository;
import com.codeclan.example.files_and_folders.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilesAndFoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	PersonRepository personRepository;

	@Test
	void contextLoads() {
	}

}
