Nice! Here's a clean and professional **`README.md`** for your font changer project — ready to be dropped into your GitHub repo:

---

```markdown
# 📝 FontChanger

A simple Java application that scans through a `.docx` file and replaces all text using the font **"Bamini"** with **"Baamini"**. Useful for large documents with mixed-language content and complex formatting like math equations, tables, and more.

---

## 🚀 Features

- ✅ Replace fonts in `.docx` files
- ✅ Handles both paragraphs and table cells
- ✅ Works on large documents with multilingual content
- ✅ Uses [Apache POI](https://poi.apache.org/) for robust DOCX support

---

## 📂 Project Structure

```
FontChanger/
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── example/
│                   └── FontChanger.java
├── pom.xml
└── README.md
```

---

## ⚙️ Prerequisites

- Java 8 or higher
- Maven
- Apache POI (added via Maven)

---

## 🧪 How It Works

The program:
1. Loads the input `.docx` file.
2. Scans all paragraphs and tables.
3. Replaces text using font `"Bamini"` with font `"Baamini"`.
4. Saves the updated file.

---

## 🛠️ How to Run

### 1. Clone the repo

```bash
git clone https://github.com/your-username/FontChanger.git
cd FontChanger
```

### 2. Add your input file

Place your `.docx` file in the project directory, e.g.:

```
D:/Users/Ahileswaran/Documents/FONTCHANGER/Desi.docx
```

Update the file path in `FontChanger.java` if needed.

### 3. Build and run

```bash
mvn compile
mvn exec:java -Dexec.mainClass="org.example.FontChanger"
```

Alternatively, run it in IntelliJ or any Java IDE.

---

## 🧾 Example

```java
String inputPath = "D:/Users/Ahileswaran/Documents/FONTCHANGER/Desi.docx";
String outputPath = "D:/Users/Ahileswaran/Documents/FONTCHANGER/output.docx";
```

---

## 📦 Maven Dependencies

```xml
<dependency>
  <groupId>org.apache.poi</groupId>
  <artifactId>poi-ooxml</artifactId>
  <version>5.2.3</version>
</dependency>
```

For full functionality, also include:
- `xmlbeans`
- `commons-io`
- `log4j-core` (optional, for clean logging)

---

## 💡 Future Ideas

- GUI to choose input/output files
- Batch font replacement
- Support for other formats (e.g., `.doc`, `.pdf`)
- Font detection summary/log

---

## 🧑‍💻 Author

**Ahileswaran**  
[GitHub](https://github.com/your-username)

---

## 📄 License

This project is licensed under the MIT License.
```

---

Let me know if you want me to include screenshots, badges (build, license, etc.), or convert this into a `README.md` file directly!
