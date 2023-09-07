import java.util.regex.*;

public class EmailDomainExtractor {
    public static void main(String[] args) {
        String email = "example.user@example.edu.org.uk";
        extractDomains(email);
    }

    public static void extractDomains(String email) {
        // Regular expression to match domains and subdomains in an email
        String domainPattern = "@([a-zA-Z0-9.-]+)";

        // Extract the domain/subdomain using regex
        Pattern pattern = Pattern.compile(domainPattern);
        Matcher matcher = pattern.matcher(email);

        if (matcher.find()) {
            String domain = matcher.group(1);
            String[] subdomains = domain.split("\\.");

            System.out.println("Domain: " + domain);
            System.out.print("Subdomains: ");
            for (String subdomain : subdomains) {
                System.out.print(subdomain + " ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid email address.");
        }
    }
}

