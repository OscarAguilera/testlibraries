def call(){
     if (params.REQUESTED_ACTION == 'deploy' && env.BRANCH_NAME == 'prod' && params.Prod_Deploy == 'true'){
                echo "Stage Deploy"
        
            }
            else if (params.REQUESTED_ACTION == 'deploy' && env.BRANCH_NAME != 'prod' && params.Prod_Deploy == 'true'){
                echo "Stage Deploy"
            }
            else {
                    echo "Skipping Deployment"
            }
}