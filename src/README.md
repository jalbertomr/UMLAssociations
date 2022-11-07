# Associations in UML 
 
A walk through the UML Associations 

 1. Association
 2. Aggregate
 3. Composition


  ## Association
    // Person ----------- Person    bidirectional association, both has his own life cycle.
    personA.setConnectWith( personB);
    personB.setConnectWith( personA);
    // Person <>------------<> Person      Not used  BiAggregation
    // siamesA ◄►-----------◄► siamesB     Not used  BiComposition
  
    // Flight ----------- Plane     bidirectional association, but is most an Aggregation in "use" but an Opposite Composition in Life
    // Flight <>--------- Plane     Flight "uses-a" Plane, If the Flight dies the Plane Not, If the Plane die the Flight die
    // Flight <>-------◄► Plane     Flight "uses-a" Plane, Plane "has-a" Flight, Flight dies the plane Not, Plane dies then Flight dies.
  
  ## Aggregation
    // PersonA <>-------- PersonB   This is an Aggregation, personA -- "has-a" | "uses-a" -- personB, both has his own life cycle.
    personA.setConnectWith( personB);
  
    // PersonA --------<> PersonB   This is an Aggregation, personB -- "has-a" | "uses-a" -- personA, both has his own life cycle.
    personB.setConnectWith( personA);
  
  ## Composition 
    // SiamesA ◄►-------- SiamesB  This is a Composition, SiamesA -- "has-a" | "uses-a" -- personB, SiamesA determines the both life cycles.
    siamesA.setConnectWith( siamesB);
  
    // SiamesA --------◄► SiamesB  This is a Composition,  SiamesB -- "has-a" | "uses-a" -- personA, SiamesB determines the both life cycles.
    siamesB.setConnectWith( siamesA);
  
    // SiamesA ◄►------◄► SiamesB  This is a Composition Not used.
    siamesA.setConnectWith( siamesB);
    siamesB.setConnectWith( siamesA);
  
  
    // Driver ----------- Vehicle
    // both has independent life cycle
    // Driver "Has a" or "Uses a" Vehicle

    // Folder ◄►----------- File
    // Folder is owner of File
    // Folder has own life cycle, File has not own life cycle, when folder dies files also dies
    // Folder "has a" collection of Files, File is "Part of" Folder

    ArrayList<File> files = new ArrayList<>( Arrays.asList(
           new File("fileA","content of file A"),
           new File("fileB", "content of file B"),
           new File("fileZ", "content of file Z")
    ));

    Folder folder = new Folder( files);

    System.out.println(folder);

    // CompanyLocation -----------◄► Company
    // Company is owner of CompanyLocations
    // companyLocation has not own life cycle, when Company is deleted then companyLocation
    // "Has a" and "Part of" relationship

    ArrayList<CompanyLocation> companyLocations = new ArrayList<>( Arrays.asList(
           new CompanyLocation("Mexico", "CDMX"),
           new CompanyLocation("Mexico", "Guadalajara"),
           new CompanyLocation("Mexico", "Monterrey")));

    Company myCompany = new Company("McDuck", "5578758748", companyLocations);

    System.out.println("Company: " + myCompany);

    // Vehicle ◄►------------- Parts
    // Parts has not own life cycle
    // Vehicle is owner of Parts
    // Parts has not own life cycle, when Vehicle is deleted then parts are deleted
    // Not exactly a natural real example because parts can exist without a vehicle

    Vehicle audi = new Vehicle("Audi", 2022, new ArrayList<>(Arrays.asList(
            new Part("AudiEngine"),
            new Part("AudiBody"))));

    System.out.println("Vehicle: " + audi);