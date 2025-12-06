def call(String branchName = "main") {

    echo "Fetching Git repository from shared library..."

    git branch: branchName,
        changelog: false,
        credentialsId: '1a09e87f-7f4d-4f5f-8f8a-6c12d43fc02a',
        poll: false,
        url: 'https://github.com/Punithmuthirevula/java-sample-webapp-war.git'

    echo "Completed fetching Git repository!"
}
