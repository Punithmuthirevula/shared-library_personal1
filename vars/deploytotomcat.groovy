def call() {

    echo "Started deploying package to Tomcat server..."

    sshPublisher(
        publishers: [
            sshPublisherDesc(
                configName: 'tomcat_puneeth_local_server',
                transfers: [
                    sshTransfer(
                        cleanRemote: false,
                        excludes: '',
                        execCommand: '''
                            /opt/tomcat11/bin/shutdown.sh
                            /opt/tomcat11/bin/startup.sh
                        ''',
                        execTimeout: 120000,
                        flatten: false,
                        makeEmptyDirs: false,
                        noDefaultExcludes: false,
                        patternSeparator: '[, ]+',
                        remoteDirectory: '',
                        remoteDirectorySDF: false,
                        removePrefix: 'target',
                        sourceFiles: 'target/my-app.war'
                    )
                ],
                usePromotionTimestamp: false,
                useWorkspaceInPromotion: false,
                verbose: false
            )
        ]
    )

    echo "Deployment completed and application started!"
}
