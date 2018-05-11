#!/bin/bash
aws lambda update-function-code\
    --zip-file fileb://$(pwd)/target/marketing-metrics-dashboard.jar\
    --region eu-central-1\
    --function-name MarketingMetricsDashboard
