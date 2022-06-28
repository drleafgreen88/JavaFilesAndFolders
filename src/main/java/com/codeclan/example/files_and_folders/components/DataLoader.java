package com.codeclan.example.files_and_folders.components;

import com.codeclan.example.files_and_folders.models.File;
import com.codeclan.example.files_and_folders.models.Folder;
import com.codeclan.example.files_and_folders.models.Person;
import com.codeclan.example.files_and_folders.repository.FileRepository;
import com.codeclan.example.files_and_folders.repository.FolderRepository;
import com.codeclan.example.files_and_folders.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        Person george = new Person("George Costanza");
        personRepository.save(george);
        Person jerry = new Person("Jerry Seinfeld");
        personRepository.save(jerry);
        Person kramer = new Person("Cosmo Kramer");
        personRepository.save(kramer);



        Folder vandelay = new Folder("Vandelay Industries", george);
        folderRepository.save(vandelay);
        Folder varnson = new Folder("Varnson & Varnson", jerry);
        folderRepository.save(varnson);
        Folder vanNostrand = new Folder("The Clinic", kramer);
        folderRepository.save(vanNostrand);



        File penske = new File("The Penske File", "txt", 50, vandelay);
        fileRepository.save(penske);
        File cereal = new File("My Favorite Cereals", "txt", 25, varnson);
        fileRepository.save(cereal);
        File elaine = new File("Elaine's Medical File", "txt", 20, vanNostrand);
        fileRepository.save(elaine);
        File newman = new File("Mail Fraud Invesigations", "txt", 10, varnson);
        fileRepository.save(newman);
    }
}
