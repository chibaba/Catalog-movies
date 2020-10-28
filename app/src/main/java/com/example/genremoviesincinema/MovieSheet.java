package com.example.genremoviesincinema;

import com.example.genremoviesincinema.ui.gallery.MovieData;

import java.util.ArrayList;
import java.util.List;

public class MovieSheet {
    List<MovieData> actionMovieList = new ArrayList<>();
    List<MovieData> fantasyMovieList = new ArrayList<>();
    List<MovieData> romanceMovieList = new ArrayList<>();

    public MovieSheet(){
        actionGenerator();
        fanasyGenerator();
        romanceGenerator();
    }


    public void actionGenerator(){
        MovieData one = new MovieData("Fandora",2004,"https://assets3.thrillist.com/v1/image/2897945/1584x1056/crop;jpeg_quality=60;progressive.jpg","With F9 the next chapter in the NOS-powered Fast and Furious saga pushed to 2021 because of the outbreak" +
                " of the coronavirus, Vin Diesel fans will have to make due with Bloodshot, a frenzied adaptation of a popular Valiant Comics title first published in the '90s." +
                " Like many non-Fast thrillers from Diesel, the results are a mixed bag, emphasizing the star's muscular frame",
                "Movieone", 3.00f);
        actionMovieList.add(one);
        MovieData two = new MovieData("Quiet hangs",2020,"https://assets3.thrillist.com/v1/image/2115301/1584x1054/crop;jpeg_quality=60.jpg","A sequel to 2018's Walter Hill-like throwback The Debt Collector, which found the reliably bruising Scott Adkins playing a reluctant mob " +
                "bagman named French, this buddy action comedy occasionally fails to pay up", "Quiet Holigang", 3.45f);
        actionMovieList.add(two);

        MovieData three = new MovieData("Strike-Back",2019,"https://assets3.thrillist.com/v1/image/2882144/1584x1054/crop;jpeg_quality=60.jpg","After battling her way through an apocalyptic desert wasteland in Mad Max: Fury Road, punching her way" +
                " through Berlin in Atomic Blonde, and tangling in the sky with the Fast and Furious crew, Charlize Theron gets her own superhero franchise with this curious " +
                "adaptation of Greg Rucka's comic series focussed on a rag-tag group un-killable mercenaries","strike", 4.10f);
        actionMovieList.add(three);

        MovieData four = new MovieData("Conraction",2012,"https://assets3.thrillist.com/v1/image/2339863/1584x1054/crop;jpeg_quality=60.jpg","Tossing aside Thor's massive hammer and trimming his gnarly Avengers: Endgame beard, Chris Hemsworth picks up " +
                "an assault rifle and gets to work in Extraction, a new Netflix shoot-em-up that re-teams the Australian actor with his former Marvel filmmaking buddies " +
                "Joe and Anthony Russo,","contraction", 4.56f);
        actionMovieList.add(four);

        MovieData five = new MovieData("Contract on Her Name",2000,"https://assets3.thrillist.com/v1/image/2866018/1584x3000/scale;jpeg_quality=60.jpg","At less than 90 minutes, this dread-soaked, Southern-fried neo-noir doesn't waste time turning the screws on" +
                " its put-upon protagonist. Leigh (Bethany Anne Lind) is introduced having recently survived an attack and possibly killed a man lying dead on the floor" +
                " of her garage. She knows exactly what happened; the viewer is kept in the dar", "five", 5.00f);
        actionMovieList.add(five);

        MovieData six = new MovieData("Lost Homeless",2020, "https://assets3.thrillist.com/v1/image/1895303/1584x1054/crop;jpeg_quality=60.jpg","Alban Lenoir, the star and co-writer of this proudly sturdy French thriller, has a rugged-yet-droll Statham-like quality," +
                " that rogue-like charisma that never reads as desperation. He plays Lino, a hapless thief who turns into an unlikely car mechanic for the police," +
                " and he spends most of the movie attempting to clear his name for a murder he didn't commit.", "seven", 3.33f);
        actionMovieList.add(six);

        MovieData seven = new MovieData(" Predators",2020, "https://assets3.thrillist.com/v1/image/2865088/1584x3000/scale;jpeg_quality=60.jpg","Birds of Prey, the recently retitledSuicide Squad spin-off starring  Margot Robbie's joyfully defiant Harley Quinn, " +
                "didn't exactly light up the box office in the same way last year's Oscar-nominated Joker movie did, but it's a lot more fun.", "dert", 1.23f
                );
        actionMovieList.add(seven);

        MovieData eight= new MovieData("TimetoHunt",2000, "https://assets3.thrillist.com/v1/image/2776429/1584x3000/scale;jpeg_quality=60.jpg","Unrelenting in its pursuit of scenarios where guys point big guns at each other in sparsely lit empty hallways, Time " +
                "to Hunt is a South Korean thriller that knows exactly what stylistic register it's playing in. A group of four friends, including Parasite and Train" +
                " to Busan break-out Choi Woo-shik, knock over a gambling house", "timetohunt", 3.56f);
        actionMovieList.add(eight);

        MovieData nine = new MovieData("BaD Gang",5, "https://assets3.thrillist.com/v1/image/2864988/1584x3000/scale;jpeg_quality=60.jpg", "In what hasn't exactly been a great year for action movies so far, Bad Boys for Life has to be the biggest surprise." +
                " Given its lengthy production history, its January release date, and the departure of series director Michael Bay -- the action auteur gets a winking cameo here, " +
                "perhaps taking a break from shooting Netflix's 6 Underground -- this movie could've been a disaster", "bad gang", 2.35f);
        actionMovieList.add(nine);

        MovieData ten = new MovieData("MuLANA",1998,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","The latest installment in Disney’s never-ending list of live-action remakes of animated classics was " +
                "scheduled to hit theaters on March 27, but it was postponed until late July due to the coronavirus pandemic—but it looks like it'll be worth the wait. While this" +
                " version doesn't have a talking dragon sidekick or multiple song-and dance-breaks, Mulan appears to be even more of a badass now than she was in 1998.", "MUKAILA", 3.56F
                );
        actionMovieList.add(ten);

        MovieData eleven = new MovieData("WAKANDA Woman 1984",2012,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","After the (much-deserved) massive success of 2017’s Wonder Woman, it makes sense that " +
                "director Patty Jenkins and star Gal Gadot would dive immediately back into the sequel. It’ll be out later this summer, with Wonder Woman going head-to-head with " +
                "Kristen Wiig’s villainous Cheetah. Though it looked like Chris Pine’s role as Steve Trevor came to an end at the close of the first film, he does make an appearance" +
                " in the sequel’s trailer, and that, combined with the fact that superhero movies play by no one’s rules, means anything could happen come August 14.","WAKANDA WOMANA", 2.45f);
        actionMovieList.add(eleven);

        MovieData twelve = new MovieData("Black Widow",2003,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","Since Scarlett Johansson’s Black Widow, a.k.a. Natasha Romanoff, first entered the Marvel Universe" +
                " in Iron Man 2, the world has been holding its breath for a standalone movie. Those dreams will finally come true this year, as Black Widow is backed by her family–played b" +
                "y Florence Pugh, Rachel Weisz, and David Harbour–on a mission to settle some unfinished business buried deep in her past.","Black widow", 3.5f);
        actionMovieList.add(twelve);

        MovieData thirteen = new MovieData("No Time to Die",2010,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","James Bond has a bit of a sexism problem, but the 25th installment in the British spy series " +
                "already looks to be miles ahead of its predecessors due to the fact that it was co-written by Killing Eve creator Phoebe Waller-Bridge and features a theme song performed " +
                "by Billie Eilish. We can’t wait to see 007 go full Fleabag–but who will play his Hot Priest?!","first", 3.56f);
        actionMovieList.add(thirteen);

        MovieData fourteen = new MovieData("The Eternals",2000,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/67334917-10157314311827488-1938253040570073088-o-0-1585754443.jpg?resize=768:*","Just when you thought Marvel couldn’t find any more huge stars to join its cinematic universe... " +
                "That’s right, Angelina Jolie and Salma Hayek are now Avengers-adjacent, as are half the Stark children and, of course, #RippedKumailNanjiani. Almost all of them will play " +
                "members of the titular alien race, who are working together to protect Earth from the Deviants, sworn enemies of the Eternals. Welcome to the next phase of the Marvel un" +
                "iverse.", "eternals", 2.34f);
        actionMovieList.add(fourteen);

        MovieData fifteen = new MovieData("Gunners: Maverick",2014,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/67334917-10157314311827488-1938253040570073088-o-0-1585754443.jpg?resize=768:*","Apparently, there’s no such thing as “too long” to wait between franchise installments" +
                ". Thirty-four years after the original Top Gun, Tom Cruise will reprise his role as Navy aviator Maverick. According to the official plot synopsis, he’ll be confronting" +
                " ghosts from his past while leading a team of pilot trainees on a highly dangerous mission–should they choose to accept it. (Oops, wrong Tom Cruise franchise.)","Gunners", 3.55f);
        actionMovieList.add(fifteen);
    }

    public void fanasyGenerator() {
        MovieData one = new MovieData("Fandora",2014,"https://assets3.thrillist.com/v1/image/1197945/1584x1056/crop;jpeg_quality=60;progressive.jpg","With F9 the next chapter in the NOS-powered Fast and Furious saga pushed to 2021 because of the outbreak" +
                " of the coronavirus, Vin Diesel fans will have to make due with Bloodshot, a frenzied adaptation of a popular Valiant Comics title first published in the '90s." +
                " Like many non-Fast thrillers from Diesel, the results are a mixed bag, emphasizing the star's muscular frame",
                "Movieone", 3.00f);
        fantasyMovieList.add(one);
        MovieData two = new MovieData("Fantasy hangs",2020,"https://assets3.thrillist.com/v1/image/2110301/1584x1054/crop;jpeg_quality=60.jpg","A sequel to 2018's Walter Hill-like throwback The Debt Collector, which found the reliably bruising Scott Adkins playing a reluctant mob " +
                "bagman named French, this buddy action comedy occasionally fails to pay up", "Quiet Holigang", 3.45f);
        fantasyMovieList.add(two);

        MovieData three = new MovieData("Strike-Back",2019,"https://assets3.thrillist.com/v1/image/2882144/1584x1054/crop;jpeg_quality=60.jpg","After battling her way through an apocalyptic desert wasteland in Mad Max: Fury Road, punching her way" +
                " through Berlin in Atomic Blonde, and tangling in the sky with the Fast and Furious crew, Charlize Theron gets her own superhero franchise with this curious " +
                "adaptation of Greg Rucka's comic series focussed on a rag-tag group un-killable mercenaries","strike", 4.10f);
        fantasyMovieList.add(three);

        MovieData four = new MovieData("FANTASTIC four",2012,"https://assets3.thrillist.com/v1/image/2339860/1584x1054/crop;jpeg_quality=60.jpg","Tossing aside Thor's massive hammer and trimming his gnarly Avengers: Endgame beard, Chris Hemsworth picks up " +
                "an assault rifle and gets to work in Extraction, a new Netflix shoot-em-up that re-teams the Australian actor with his former Marvel filmmaking buddies " +
                "Joe and Anthony Russo,","contraction", 4.56f);
        fantasyMovieList.add(four);

        MovieData five = new MovieData("Contract Fantasy",2000,"https://assets3.thrillist.com/v1/image/2866018/1584x3000/scale;jpeg_quality=60.jpg","At less than 90 minutes, this dread-soaked, Southern-fried neo-noir doesn't waste time turning the screws on" +
                " its put-upon protagonist. Leigh (Bethany Anne Lind) is introduced having recently survived an attack and possibly killed a man lying dead on the floor" +
                " of her garage. She knows exactly what happened; the viewer is kept in the dar", "five", 5.00f);
        fantasyMovieList.add(five);

        MovieData six = new MovieData("Lost Homeless",2020, "https://assets3.thrillist.com/v1/image/2095303/1584x1054/crop;jpeg_quality=60.jpg","Alban Lenoir, the star and co-writer of this proudly sturdy French thriller, has a rugged-yet-droll Statham-like quality," +
                " that rogue-like charisma that never reads as desperation. He plays Lino, a hapless thief who turns into an unlikely car mechanic for the police," +
                " and he spends most of the movie attempting to clear his name for a murder he didn't commit.", "seven", 3.33f);
        fantasyMovieList.add(six);

        MovieData seven = new MovieData(" adventure island",2020, "https://assets3.thrillist.com/v1/image/2865088/1584x3000/scale;jpeg_quality=60.jpg","Birds of Prey, the recently retitledSuicide Squad spin-off starring  Margot Robbie's joyfully defiant Harley Quinn, " +
                "didn't exactly light up the box office in the same way last year's Oscar-nominated Joker movie did, but it's a lot more fun.", "dert", 1.23f
        );
        fantasyMovieList.add(seven);

        MovieData eight= new MovieData("TimetoHunt",2000, "https://assets3.thrillist.com/v1/image/2476429/1584x3000/scale;jpeg_quality=60.jpg","Unrelenting in its pursuit of scenarios where guys point big guns at each other in sparsely lit empty hallways, Time " +
                "to Hunt is a South Korean thriller that knows exactly what stylistic register it's playing in. A group of four friends, including Parasite and Train" +
                " to Busan break-out Choi Woo-shik, knock over a gambling house", "timetohunt", 3.56f);
        fantasyMovieList.add(eight);

        MovieData nine = new MovieData("BaD hostel",2000, "https://assets3.thrillist.com/v1/image/2864988/1584x3000/scale;jpeg_quality=60.jpg", "In what hasn't exactly been a great year for action movies so far, Bad Boys for Life has to be the biggest surprise." +
                " Given its lengthy production history, its January release date, and the departure of series director Michael Bay -- the action auteur gets a winking cameo here, " +
                "perhaps taking a break from shooting Netflix's 6 Underground -- this movie could've been a disaster", "bad gang", 2.35f);
        fantasyMovieList.add(nine);

        MovieData ten = new MovieData("MuLANA",1998,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","The latest installment in Disney’s never-ending list of live-action remakes of animated classics was " +
                "scheduled to hit theaters on March 27, but it was postponed until late July due to the coronavirus pandemic—but it looks like it'll be worth the wait. While this" +
                " version doesn't have a talking dragon sidekick or multiple song-and dance-breaks, Mulan appears to be even more of a badass now than she was in 1998.", "MUKAILA", 3.56F
        );
        fantasyMovieList.add(ten);

        MovieData eleven = new MovieData("WAKANDA Woman 1984",2012,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","After the (much-deserved) massive success of 2017’s Wonder Woman, it makes sense that " +
                "director Patty Jenkins and star Gal Gadot would dive immediately back into the sequel. It’ll be out later this summer, with Wonder Woman going head-to-head with " +
                "Kristen Wiig’s villainous Cheetah. Though it looked like Chris Pine’s role as Steve Trevor came to an end at the close of the first film, he does make an appearance" +
                " in the sequel’s trailer, and that, combined with the fact that superhero movies play by no one’s rules, means anything could happen come August 14.","WAKANDA WOMANA", 2.45f);
        fantasyMovieList.add(eleven);

        MovieData twelve = new MovieData("Black Widow",2003,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","Since Scarlett Johansson’s Black Widow, a.k.a. Natasha Romanoff, first entered the Marvel Universe" +
                " in Iron Man 2, the world has been holding its breath for a standalone movie. Those dreams will finally come true this year, as Black Widow is backed by her family–played b" +
                "y Florence Pugh, Rachel Weisz, and David Harbour–on a mission to settle some unfinished business buried deep in her past.","Black widow", 3.5f);
        fantasyMovieList.add(twelve);

        MovieData thirteen = new MovieData("No Time to Die",2010,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","James Bond has a bit of a sexism problem, but the 25th installment in the British spy series " +
                "already looks to be miles ahead of its predecessors due to the fact that it was co-written by Killing Eve creator Phoebe Waller-Bridge and features a theme song performed " +
                "by Billie Eilish. We can’t wait to see 007 go full Fleabag–but who will play his Hot Priest?!","first", 3.56f);
        fantasyMovieList.add(thirteen);

        MovieData fourteen = new MovieData("The Eternals",2000,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/67334917-10157314311827488-1938253040570073088-o-0-1585754443.jpg?resize=768:*","Just when you thought Marvel couldn’t find any more huge stars to join its cinematic universe... " +
                "That’s right, Angelina Jolie and Salma Hayek are now Avengers-adjacent, as are half the Stark children and, of course, #RippedKumailNanjiani. Almost all of them will play " +
                "members of the titular alien race, who are working together to protect Earth from the Deviants, sworn enemies of the Eternals. Welcome to the next phase of the Marvel un" +
                "iverse.", "eternals", 2.34f);
        fantasyMovieList.add(fourteen);

        MovieData fifteen = new MovieData("Gunners: Maverick",2014,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/67334917-10157314311827488-1938253040570073088-o-0-1585754443.jpg?resize=768:*","Apparently, there’s no such thing as “too long” to wait between franchise installments" +
                ". Thirty-four years after the original Top Gun, Tom Cruise will reprise his role as Navy aviator Maverick. According to the official plot synopsis, he’ll be confronting" +
                " ghosts from his past while leading a team of pilot trainees on a highly dangerous mission–should they choose to accept it. (Oops, wrong Tom Cruise franchise.)","Gunners", 3.55f);
        fantasyMovieList.add(fifteen);

    }

    public void romanceGenerator(){

        MovieData one = new MovieData("Fandora",2016,"https://assets3.thrillist.com/v1/image/1297945/1584x1056/crop;jpeg_quality=60;progressive.jpg","With F9 the next chapter in the NOS-powered Fast and Furious saga pushed to 2021 because of the outbreak" +
                " of the coronavirus, Vin Diesel fans will have to make due with Bloodshot, a frenzied adaptation of a popular Valiant Comics title first published in the '90s." +
                " Like many non-Fast thrillers from Diesel, the results are a mixed bag, emphasizing the star's muscular frame",
                "Movieone", 3.00f);
        romanceMovieList.add(one);
        MovieData two = new MovieData("Fantasy hangs",2020,"https://assets3.thrillist.com/v1/image/2110301/1584x1054/crop;jpeg_quality=60.jpg","A sequel to 2018's Walter Hill-like throwback The Debt Collector, which found the reliably bruising Scott Adkins playing a reluctant mob " +
                "bagman named French, this buddy action comedy occasionally fails to pay up", "Quiet Holigang", 3.45f);
        romanceMovieList.add(two);

        MovieData three = new MovieData("Strike-Back",2019,"https://assets3.thrillist.com/v1/image/2882144/1584x1054/crop;jpeg_quality=60.jpg","After battling her way through an apocalyptic desert wasteland in Mad Max: Fury Road, punching her way" +
                " through Berlin in Atomic Blonde, and tangling in the sky with the Fast and Furious crew, Charlize Theron gets her own superhero franchise with this curious " +
                "adaptation of Greg Rucka's comic series focussed on a rag-tag group un-killable mercenaries","strike", 4.10f);
        romanceMovieList.add(three);

        MovieData four = new MovieData("FANTASTIC four",2012,"https://assets3.thrillist.com/v1/image/2339860/1584x1054/crop;jpeg_quality=60.jpg","Tossing aside Thor's massive hammer and trimming his gnarly Avengers: Endgame beard, Chris Hemsworth picks up " +
                "an assault rifle and gets to work in Extraction, a new Netflix shoot-em-up that re-teams the Australian actor with his former Marvel filmmaking buddies " +
                "Joe and Anthony Russo,","contraction", 4.56f);
        romanceMovieList.add(four);

        MovieData five = new MovieData("Contract Fantasy",2000,"https://assets3.thrillist.com/v1/image/2866018/1584x3000/scale;jpeg_quality=60.jpg","At less than 90 minutes, this dread-soaked, Southern-fried neo-noir doesn't waste time turning the screws on" +
                " its put-upon protagonist. Leigh (Bethany Anne Lind) is introduced having recently survived an attack and possibly killed a man lying dead on the floor" +
                " of her garage. She knows exactly what happened; the viewer is kept in the dar", "five", 5.00f);
        romanceMovieList.add(five);

        MovieData six = new MovieData("Lost Homeless",2020, "https://assets3.thrillist.com/v1/image/2095303/1584x1054/crop;jpeg_quality=60.jpg","Alban Lenoir, the star and co-writer of this proudly sturdy French thriller, has a rugged-yet-droll Statham-like quality," +
                " that rogue-like charisma that never reads as desperation. He plays Lino, a hapless thief who turns into an unlikely car mechanic for the police," +
                " and he spends most of the movie attempting to clear his name for a murder he didn't commit.", "seven", 3.33f);
        romanceMovieList.add(six);

        MovieData seven = new MovieData(" adventure island",2020, "https://assets3.thrillist.com/v1/image/2865088/1584x3000/scale;jpeg_quality=60.jpg","Birds of Prey, the recently retitledSuicide Squad spin-off starring  Margot Robbie's joyfully defiant Harley Quinn, " +
                "didn't exactly light up the box office in the same way last year's Oscar-nominated Joker movie did, but it's a lot more fun.", "dert", 1.23f
        );
        romanceMovieList.add(seven);

        MovieData eight= new MovieData("TimetoHunt",2000, "https://assets3.thrillist.com/v1/image/2476429/1584x3000/scale;jpeg_quality=60.jpg","Unrelenting in its pursuit of scenarios where guys point big guns at each other in sparsely lit empty hallways, Time " +
                "to Hunt is a South Korean thriller that knows exactly what stylistic register it's playing in. A group of four friends, including Parasite and Train" +
                " to Busan break-out Choi Woo-shik, knock over a gambling house", "timetohunt", 3.56f);
        romanceMovieList.add(eight);

        MovieData nine = new MovieData("BaD hostel",2000, "https://assets3.thrillist.com/v1/image/2864988/1584x3000/scale;jpeg_quality=60.jpg", "In what hasn't exactly been a great year for action movies so far, Bad Boys for Life has to be the biggest surprise." +
                " Given its lengthy production history, its January release date, and the departure of series director Michael Bay -- the action auteur gets a winking cameo here, " +
                "perhaps taking a break from shooting Netflix's 6 Underground -- this movie could've been a disaster", "bad gang", 2.35f);
        romanceMovieList.add(nine);

        MovieData ten = new MovieData("MuLANA",1998,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","The latest installment in Disney’s never-ending list of live-action remakes of animated classics was " +
                "scheduled to hit theaters on March 27, but it was postponed until late July due to the coronavirus pandemic—but it looks like it'll be worth the wait. While this" +
                " version doesn't have a talking dragon sidekick or multiple song-and dance-breaks, Mulan appears to be even more of a badass now than she was in 1998.", "MUKAILA", 3.56F
        );
        romanceMovieList.add(ten);

        MovieData eleven = new MovieData("WAKANDA Woman 1984",2012,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","After the (much-deserved) massive success of 2017’s Wonder Woman, it makes sense that " +
                "director Patty Jenkins and star Gal Gadot would dive immediately back into the sequel. It’ll be out later this summer, with Wonder Woman going head-to-head with " +
                "Kristen Wiig’s villainous Cheetah. Though it looked like Chris Pine’s role as Steve Trevor came to an end at the close of the first film, he does make an appearance" +
                " in the sequel’s trailer, and that, combined with the fact that superhero movies play by no one’s rules, means anything could happen come August 14.","WAKANDA WOMANA", 2.45f);
        romanceMovieList.add(eleven);

        MovieData twelve = new MovieData("Black Widow",2003,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","Since Scarlett Johansson’s Black Widow, a.k.a. Natasha Romanoff, first entered the Marvel Universe" +
                " in Iron Man 2, the world has been holding its breath for a standalone movie. Those dreams will finally come true this year, as Black Widow is backed by her family–played b" +
                "y Florence Pugh, Rachel Weisz, and David Harbour–on a mission to settle some unfinished business buried deep in her past.","Black widow", 3.5f);
        romanceMovieList.add(twelve);

        MovieData thirteen = new MovieData("No Time to Die",2010,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","James Bond has a bit of a sexism problem, but the 25th installment in the British spy series " +
                "already looks to be miles ahead of its predecessors due to the fact that it was co-written by Killing Eve creator Phoebe Waller-Bridge and features a theme song performed " +
                "by Billie Eilish. We can’t wait to see 007 go full Fleabag–but who will play his Hot Priest?!","first", 3.56f);
        romanceMovieList.add(thirteen);

        MovieData fourteen = new MovieData("The Eternals",2000,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/67334917-10157314311827488-1938253040570073088-o-0-1585754443.jpg?resize=768:*","Just when you thought Marvel couldn’t find any more huge stars to join its cinematic universe... " +
                "That’s right, Angelina Jolie and Salma Hayek are now Avengers-adjacent, as are half the Stark children and, of course, #RippedKumailNanjiani. Almost all of them will play " +
                "members of the titular alien race, who are working together to protect Earth from the Deviants, sworn enemies of the Eternals. Welcome to the next phase of the Marvel un" +
                "iverse.", "eternals", 2.34f);
        romanceMovieList.add(fourteen);

        MovieData fifteen = new MovieData("Gunners: Maverick",2014,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/67334917-10157314311827488-1938253040570073088-o-0-1585754443.jpg?resize=768:*","Apparently, there’s no such thing as “too long” to wait between franchise installments" +
                ". Thirty-four years after the original Top Gun, Tom Cruise will reprise his role as Navy aviator Maverick. According to the official plot synopsis, he’ll be confronting" +
                " ghosts from his past while leading a team of pilot trainees on a highly dangerous mission–should they choose to accept it. (Oops, wrong Tom Cruise franchise.)","Gunners", 3.55f);
        romanceMovieList.add(fifteen);


    }

    public List<MovieData> getActionMovieList(){
        return actionMovieList;
    }

    public List<MovieData> getFantasyMovieList(){
        return fantasyMovieList;
    }

    public List<MovieData> getRomanceMovieList(){
        return romanceMovieList;
    }


}
