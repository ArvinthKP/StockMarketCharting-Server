package com.smcharts;

import java.util.stream.Stream;

import javax.annotation.Resource;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.smcharts.model.Company;
import com.smcharts.model.IPO;
import com.smcharts.model.Sector;
import com.smcharts.model.StockExchange;
import com.smcharts.model.User;
import com.smcharts.repo.CompanyRepo;
import com.smcharts.repo.IPORepo;
import com.smcharts.repo.SectorRepo;
import com.smcharts.repo.StockExchangeRepo;
import com.smcharts.repo.UserRepo;
import com.smcharts.service.StorageService;

@SpringBootApplication
public class SmchartsApplication implements CommandLineRunner{

	@Resource
	StorageService storageService;
	
	public static void main(String[] args) {
		SpringApplication.run(SmchartsApplication.class, args);
	}

	@Bean
	ApplicationRunner init(UserRepo userRepo) {
		return args -> {
			Stream.of(new User("User1", "root", "USER", "user1@gmail.com", "9876543210"),
					new User("User2", "root", "USER", "user2@gmail.com", "9879879870"),
					new User("Admin", "root", "ADMIN", "admin@gmail.com", "9999888870")).forEach(user -> {
						userRepo.save(user);
					});
			userRepo.findAll().forEach(System.out::println);
		};
	}

	@Bean
	ApplicationRunner init1(SectorRepo sectorRepo) {
		return args -> {
			Stream.of(new Sector("IT"), new Sector("Real Estate")).forEach(sector -> {
				sectorRepo.save(sector);
			});
			sectorRepo.findAll().forEach(System.out::println);
		};
	}

	@Bean
	ApplicationRunner init2(CompanyRepo companyRepo) {
		return args -> {
			Stream.of(
					new Company("Company1", "400000", "John Doe", "Smith Ker", "NYSE", "IT", "Lorem ipsum dolres amet"),
					new Company("Company2", "500000", "Jane Doe", "Smith Mark", "NYSE", "Real Estate",
							"Lorem ipsum dolres amet"),
					new Company("Company3", "600000", "Mark Smith", "Debbie Korner", "NASDAQ", "IT",
							"Lorem ipsum dolres amet"),
					new Company("Company4", "850000", "Mary Smith", "Nova Ahrix", "NASDAQ", "Real Estate",
							"Lorem ipsum dolres amet"),
					new Company("Company5", "900000", "Shelly Korby", "Salazar Mark", "BSE", "IT",
							"Lorem ipsum dolres amet"),
					new Company("Company6", "100000", "Hissar Ahmed", "Kazuto Kirigaya", "BSE", "Real Estate",
							"Lorem ipsum dolres amet"),
					new Company("Company7", "440000", "Jim Corbet", "Hasan Muhammed", "NSE", "IT",
							"Lorem ipsum dolres amet"),
					new Company("Company8", "670000", "Brian Greene", "Jelal Erza", "NSE", "Real Estate",
							"Lorem ipsum dolres amet"),
					new Company("Company9", "900000", "Jihan Zoy", "Natsu Dragneet", "BSE", "Real Estate",
							"Lorem ipsum dolres amet"),
					new Company("Company10", "990000", "Moore Johnson", "Lucy Heartfilia", "NSE", "IT",
							"Lorem ipsum dolres amet"))
					.forEach(company -> {
						companyRepo.save(company);
					});
			companyRepo.findAll().forEach(System.out::println);
		};
	}

	@Bean
	ApplicationRunner init3(IPORepo ipoRepo) {
		return args -> {
			Stream.of(new IPO("Company1", "NYSE", "2500", "100000", "2019-08-13T09:00", "Lorem Ipsum Dolres amet"),
					new IPO("Company2", "NYSE", "6700", "150000", "2019-07-13T14:00", "Lorem Ipsum Dolres amet"),
					new IPO("Company3", "NASDAQ", "1200", "240000", "2019-01-13T15:00", "Lorem Ipsum Dolres amet"),
					new IPO("Company4", "NASDAQ", "9800", "670000", "2019-02-13T13:00", "Lorem Ipsum Dolres amet"),
					new IPO("Company5", "BSE", "7400", "990000", "2019-08-19T10:00", "Lorem Ipsum Dolres amet"))
					.forEach(ipo -> {
						ipoRepo.save(ipo);
					});
			ipoRepo.findAll().forEach(System.out::println);
		};
	}

	@Bean
	ApplicationRunner init4(StockExchangeRepo stockExchangeRepo) {
		return args -> {
			Stream.of(new StockExchange("NYSE", "New York Stock Exchange", "New York"),
					new StockExchange("NASDAQ", "National Association of Securities Dealers Automated Quotations",
							"US"),
					new StockExchange("BSE", "Bombay Stock Exchange", "Mumbai, India"),
					new StockExchange("NSE", "National Stock Exchange", "India")).forEach(stockExchange -> {
						stockExchangeRepo.save(stockExchange);
					});
			stockExchangeRepo.findAll().forEach(System.out::println);
		};
	}

//	@Bean
//	ApplicationRunner init5(StockPriceRepo stockPriceRepo) {
//		return args -> {
//			Stream.of(new StockPrice(1, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "09:00"),
//					new StockPrice(1, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "10:00"),
//					new StockPrice(1, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "11:00"),
//					new StockPrice(1, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "12:00"),
//					new StockPrice(1, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "1:00"),
//					new StockPrice(1, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "2:00"),
//					new StockPrice(1, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "3:00"),
//					new StockPrice(1, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "4:00"),
//					new StockPrice(1, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "5:00"),
//					new StockPrice(1, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "6:00"),
//					new StockPrice(2, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "09:00"),
//					new StockPrice(2, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "10:00"),
//					new StockPrice(2, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "11:00"),
//					new StockPrice(2, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "12:00"),
//					new StockPrice(2, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "1:00"),
//					new StockPrice(2, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "2:00"),
//					new StockPrice(2, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "3:00"),
//					new StockPrice(2, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "4:00"),
//					new StockPrice(2, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "5:00"),
//					new StockPrice(2, "NYSE", (long) (Math.random() * 1000 + 1), "2019-01-13", "6:00"))
//					.forEach(stockPrice -> {
//						stockPriceRepo.save(stockPrice);
//					});
//			stockPriceRepo.findAll().forEach(System.out::println);
//		};
//	}
	
	@Override
	public void run(String... arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}
}
