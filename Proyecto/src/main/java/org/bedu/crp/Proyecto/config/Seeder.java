package org.bedu.crp.Proyecto.config;

import lombok.extern.slf4j.Slf4j;
import org.bedu.crp.Proyecto.model.Spectrum;
import org.bedu.crp.Proyecto.repository.ISpectrumRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Slf4j
@Component
public class Seeder implements CommandLineRunner {
    private ISpectrumRepository repository;
    public Seeder(ISpectrumRepository repository){
        this.repository=repository;
    }
    private static Logger logger= LoggerFactory.getLogger(Seeder.class);
    int n, tam_T, year, mount, day;
    float t_i, t_f, t_c,  aux, beta, gamma, at, epsilon;
    String sta, contry, town, name_file;
    @Override
    public void run(String[] args){
        logger.info("Inicia la clase Seeder");
        /*
        System.out.println("Ingresa un numero de archivos por ser analizados");
        Scanner escanear = new Scanner(System.in);
        int n = escanear.nextInt();
        // Valores iniciales
        System.out.println("Valor inicial");
        t_i = escanear.nextFloat();
        System.out.println("Valor final");
        t_f = escanear.nextFloat();
        System.out.println("Valor incremento");
        t_c = escanear.nextFloat();
        tam_T=(int)((t_f-t_i)/t_c)+1;

        // vector tiempo
        float [] T= new float[tam_T];
        for (int i=0; i<tam_T;i++) {
            if (i==0){
                T[i]=t_i;
            }else {
                T[i] = t_i + t_c;
                t_i = T[i];
            }
        }

        // Variables para beta y gama
        beta=1/4;
        gamma=1/2;

        //Matriz Resultados
        float [][] M= new float[tam_T][n*4];
        System.out.println("Value delta t");
        at = escanear.nextFloat();
        System.out.println("damping rate");
        epsilon = escanear.nextFloat();
        epsilon=epsilon/100;
        //n=n+1;

        System.out.println("Data of sesimic:");
        for (int i=0; i<n; i++){
        */
        Scanner escanear = new Scanner(System.in);
        //Lectura del archivo a analizar
                System.out.println("name file to analyzed: ");
                name_file = escanear.nextLine();
                System.out.println("Description: ");
                sta = escanear.nextLine();
                System.out.println("Contry:");
                contry = escanear.nextLine();
                System.out.println("town:");
                town = escanear.nextLine();
                System.out.println("year");
                year = escanear.nextInt();
                System.out.println("mount");
                mount = escanear.nextInt();
                System.out.println("day");
                day = escanear.nextInt();





                Spectrum sp = new Spectrum();
                sp.setName(sta);
                sp.setChannel("HHZ");
                sp.setFileSprectrum(name_file);
                sp.setCountry(contry);
                sp.setTown(town);
                sp.setYear(year);
                sp.setMount(mount);
                sp.setDay(day);
                repository.save(sp);
                log.info("Datos guardados en la BD...");









        //}










    }
}
