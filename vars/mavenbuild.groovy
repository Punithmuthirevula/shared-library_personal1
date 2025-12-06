def call() {

    echo "Started creating a Maven package..."

    sh 'mvn clean package'

    echo "Maven package created successfully!"
}
