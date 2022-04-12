package Lab13_2;

class Reading {
    private String name;
    private String mainchar;
    private int page;


    public Reading(String name , String mainchar, int page){
        this.name = name;
        this.mainchar = mainchar;
        this.page = page;
    }

    public String getName(){
        return this.name;
    }

    public String getChar(){
        return this.mainchar;
    }

    public int getPage(){
        return this.page;
    }
}

// novels
class Novels extends Reading{
    public Novels(String name , String mainchar, int page){
        super(name , mainchar , page);
    }
    public void novels(){
        System.out.println("Book : " + getName());
        System.out.println("Mian Character : " + getChar());
        System.out.println("Page : " + getPage());
        System.out.println();
    }
}

//Magazine
class Magazine extends Reading{
    public Magazine(String name , String mainchar, int page){
        super(name , mainchar , page);
    }
    public void magazine(){
        System.out.println("Book : " + getName());
        System.out.println("Mian Character : " + getChar());
        System.out.println("Page : " + getPage());
        System.out.println();
    }
}

//technical journals
class Journals extends Reading{
    public Journals(String name , String mainchar, int page){
        super(name , mainchar , page);
    }
    public void journals(){
        System.out.println("Book : " + getName());
        System.out.println("Mian Character : " + getChar());
        System.out.println("Page : " + getPage());
        System.out.println();
    }
}

//textbooks
class Textbooks extends Reading{
    public Textbooks(String name , String mainchar, int page){
        super(name , mainchar , page);
    }
    public void textbooks(){
        System.out.println("Book : " + getName());
        System.out.println("Mian Character : " + getChar());
        System.out.println("Page : " + getPage());
        
    }
}