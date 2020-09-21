## Assignment2_Week38_TDD
**[Assignment Link](https://datsoftlyngby.github.io/soft2020fall/resources/36e3ee03-assignment-02.pdf)**  

### Reflections
**Computer mouse**:  
TDD baseret på først og fremmest og teste cursoren på skærmen. Derefter ville jeg teste en knap adgangen, og lave en mock på funktionaliteten til cursoren, for at isolere test funktionalitet på knapperne.   

**Catastrophic failure**:  
Et banksystem, hvor der kun gennemføres en transaktion, f.eks. kun hæves på en konto, men ikke indsættes på en anden konto. I et sådan tilfælde ville TDD have afhjulpet fejlen, da man ville have set det ind man videreudviklede systemet.
***
### Investigation of tools
#### JUnit 5
**@Tag**  
For at filtrere tests kan man sætte et @Tag på dem man ønsker, skal kunne køre for sig selv. Dette gøres enten på en hel test klasse eller enkelte testmetoder. Kunne bruges til at filtrere bestemt test under egen filter.  
 
**@Disabled**  
Hvis man ønsker at udelukke test fra en kørsel, kan dette gøres ved at bruge annoteringen @Disabled på enten en test klasse eller enkelte metoder, som dermed udelukkes når en test kørsel udføres.      
  
**@RepeatedTest**  
Denne giver mulighed for at køre samme test flere gange, hver enkelt test køres som en almindelig test. Det skal angives i syntaxen hvor man gange man ønsker testen gentaget. Kunne måske være brugbar hvis man har en metode der skal give bestemt output efter et bestemt antal gennemkørsler af en test.    
  
**@BeforeEach, @AfterEach**  
Dette gør at det er muligt at angive specifikke kode, som skal køres før hver test og efter hver test.
Kunne være brugbart hvis man har en bestemt variabel eller klasse som bruges flere stedet.    
  
**@BeforeAll, @AfterAll**  
Denne annotering kan bruges hvis man har bestemt kode, som skal køre alle test eller efter alle test.  

**@DisplayName**  
Giver mulighed for at se et hvis navn under afvikling af test med syntaxen @DisplayName (”TEXT”), kunne være brugbart hvis man ønsker konkret navngivning i stedet for metodenavnet.    

**@Nested**  
Dette gør, at man kan initialisere attributter, og derefter bruge dem i inner classer, f.eks. ved opdeling/samling af bestemte type metoder under samme overordnede test. Det kan bruges til at give struktur i test.   

**assumeFalse, assumeTrue**  
Kan bruges ved at sætte nogle preconditions for test koden, som skal overholdes før testen køre, hvis ikke den er overholdt vil testen blive ignoreret.  

#### Mocking frameworks (Mockito vs. EasyMock)
**What are their similarities?**  
Begge frameworks kommer stort set, på de eksempler jeg har set omkring dem, med samme måde at mocke på, dog med en lille ændring i syntaxen, men stadig med f.eks. ”when” i Mockito og ”expect” i EasyMock.  

**What are their differences?**  
Jeg synes der er forskel på måden man koder test frameworket på, f.eks. kræver Mockito ikke så meget, og virker nemmere at gå til end f.eks. EasyMock, hvor der er konkret syntaxer man skal skrive i hver test uden at få exception, hvilket jeg tror jeg ville kunne overse.

**Which one would you prefer, if any, and why?**  
Umiddelbart når jeg har kigget på test frameworks synes jeg, at Mockito, som vi også så i klassen, ser mest ud til at være lige til, og derfor ville jeg nok bruge det, men det er nyt for mig omkring mocking, så man kan blive klogere med tiden, og måske indse at andre er bedre, men ligenu ville jeg vælge Mockito.
***
