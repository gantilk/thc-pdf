# 🧠 GridSnatcher: The Crossword Heist

> A Spring Boot app that scrapes the web, finds crossword puzzles, and prints them prettier than your grandma’s wallpaper.

---

## 🕵️ What Is This?

**GridSnatcher** is your humble, caffeine-fueled bot that:
- Crawls a **non-paywalled** website like a crossword-loving raccoon
- Digs out deliciously structured **crossword grids**
- Extracts **Across** and **Down** clues (because context matters)
- Spins up a **printable PDF**—perfect for those who still believe pens > pixels

---

## ⚙️ How It Works

1. **You give it a URL**  
   _(like the Sunday crossword you forgot to do)_

2. **It fetches the page and scans for grid-like HTML DNA**  
   _(tables, clues, suspicious black squares)_

3. **It parses the clues with surgical precision**  
   _(thanks to Jsoup and a lot of regex rage)_

4. **Boom: A PDF file is born**  
   - Title
   - Clean, dark-on-light grid
   - Across & Down clues
   - No ads. No trackers. No nonsense.

---

## 🧪 Tech Stack

| Layer            | Stuff Used                        |
|------------------|------------------------------------|
| 💻 Framework     | Spring Boot (Java 17+)             |
| 🌍 Web Parsing   | Jsoup (because HTML lies)          |
| 🧾 PDF Gen       | Apache PDFBox                      |
| 📥 Input         | REST controller (`/generate`)      |
| ☕ Coffee         | Optional but highly recommended    |

---

## 🚀 Running the App

```bash
./mvnw spring-boot:run
````

Then hit:

```
POST /generate
Content-Type: application/json

{
  "url": "https://example.com/your-daily-crossword"
}
```

Sit back and wait for your beautiful PDF. And maybe question your life choices.

---

## 🛑 Legal Note

Only works with **non-paywalled** and **public** sites.
Don’t scrape things your mom wouldn’t be proud of.

---

## 😎 Pro Tips

* Pair this with a printer and a strong espresso
* Works best with classic cryptic crosswords
* Want to OCR a scanned puzzle? That's v2... and your problem.

---

## 👾 Future Features (aka TODOs That May Never Happen)

* Automatic email delivery of PDFs
* Crossword solving mode (hello, AI overlords)
* Dark mode PDF (for goth puzzlers)
* Instant submission to The New Yorker's rejection inbox

---

