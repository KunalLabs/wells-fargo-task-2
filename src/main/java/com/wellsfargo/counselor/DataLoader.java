package com.wellsfargo.counselor;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.entity.Client;
import com.wellsfargo.counselor.entity.Portfolio;
import com.wellsfargo.counselor.entity.Security;
import com.wellsfargo.counselor.repository.AdvisorRepository;
import com.wellsfargo.counselor.repository.ClientRepository;
import com.wellsfargo.counselor.repository.PortfolioRepository;
import com.wellsfargo.counselor.repository.SecurityRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final AdvisorRepository advisorRepository;
    private final ClientRepository clientRepository;
    private final PortfolioRepository portfolioRepository;
    private final SecurityRepository securityRepository;

    public DataLoader(
        AdvisorRepository advisorRepository,
        ClientRepository clientRepository,
        PortfolioRepository portfolioRepository,
        SecurityRepository securityRepository
    ) {
        this.advisorRepository = advisorRepository;
        this.clientRepository = clientRepository;
        this.portfolioRepository = portfolioRepository;
        this.securityRepository = securityRepository;
    }

    @Override
    public void run(String... args) {
        
        Advisor advisor = new Advisor("Kunal", "Chaudhari", "Bhusawal", "9999999999", "kunal@example.com");
        advisorRepository.save(advisor);

    
        Client client = new Client("John", "Doe", "Mumbai", "8888888888", "john@example.com", advisor);
        clientRepository.save(client);

        client = new Client("ABC", "DEF", "Pune", "8888888889", "abc@example.com", advisor);
        clientRepository.save(client);


    
        Portfolio portfolio = new Portfolio(client, LocalDate.now());

        portfolioRepository.save(portfolio);

        
        Security security1 = new Security(portfolio, "AAPL", "Apple Inc.", 150.0, 50, "Stock");
        Security security2 = new Security(portfolio, "TSLA", "Tesla Inc.", 700.0, 25, "Stock");
        Security security3 = new Security(portfolio, "TATA", "TaTA Inc.", 800.0, 29, "Stock");

        securityRepository.save(security1);
        securityRepository.save(security2);
        securityRepository.save(security3);

        System.out.println("✅ Sample data saved to the database!");
    }
}
