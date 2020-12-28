# apitest

## これは何？

- localhost:8080 にアクセスするとJsonを返却します。
  - 要はWebAPIです。
- SpringBootの標準機能を利用しています。
- Thymeleafは利用していません。
  - ThymeleafだとHTMLの読み込みが必須なのかと思って専用のPJを用意しましたが、実際はそんなことないっぽいです。
    - 返却時の値にString型を指定するとその名称に合致するHTMLを、オブジェクト型を指定するとJacksonでよしなにJson型に返却してくれるっぽい？（未調査）
- http://localhost:8080/?hoge=100&fuga=99　のように、hogeとfugaにパラメータを受け渡すと値がレスポンスJsonに反映されます。

## 利用技術群

あえて書くほどでもないですが。。。

- Java
  - Spring Boot
  - Maven
  - Lombok
- Git（ここ）

## ハマったことメモ

- Thymeleafを導入しているとWebAPIとしては作れない？
  - 未調査だがおそらくそんなことはない。戻り値の指定方法で振り分け可能？
  - WebAPIの戻り値として用いるBeanについては、各パラメタに対して@JsonPropertyを付ける必要があった。
- 色々とインストールが必要。
  - Java（当然）
  - Maven（Zipを解凍してPathを通す必要アリ）
- VSCodeで開発する場合、Extensionの追加も必要。
  - Java Extension Pack
  - Spring Boot Extension Pack
  - Maven
  - Lombok
    - Lombokもインストールが必要なのに気づかなくてハマった。（ビルドが通らない）
- Gitのアカウントの切り替え方法が分からなかった
  - Windowsの「資格情報マネージャ＞Windows 資格情報＞Git」の情報を削除し、再度ログインすればOK
- Herokuへのデプロイ時に、system.propertiesファイルでJavaのバージョンを明示的に指定しないとエラーが発生した
  - https://test34589765.herokuapp.com/?hoge=System&fuga=aaa
