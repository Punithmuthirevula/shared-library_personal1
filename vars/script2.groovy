def call(String branchName = "main") {

    echo "Fetching Git repository from shared library..."

    git branch: branchName,
        changelog: false,
        credentialsId: '43532e3c-3c93-481c-b86d-81e44e3ab398',
        poll: false,
        url: 'https://github.com/Punithmuthirevula/java-sample-webapp-war.git'

    echo "Completed fetching Git repository!"
}
